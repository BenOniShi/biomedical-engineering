package com.cdmu.controller;

import com.cdmu.constant.ResultConstant;
import com.cdmu.model.ResultInfo;
import com.cdmu.utils.ResultInfoUtil;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @author BenOniShi
 * @date 2020/5/2 2:05
 */
@RequestMapping("/upload")
@Controller
public class UploadController {

    @Autowired
    private ResultInfoUtil resultInfoUtil;
    @Autowired
    private Environment env;


    @RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo fileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        String filename = file.getOriginalFilename();
        String suffixName = filename.substring(filename.lastIndexOf("."));
        String md5FileName = new Md5Hash(filename + new Date()) + suffixName;
        String path = env.getProperty("upload-file-path") + "/" + filename;
        File dest = new File(path);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
            return resultInfoUtil.success(ResultConstant.FAILED_CODE, ResultConstant.FAILED_MSG);
        }
        return resultInfoUtil.success(ResultConstant.SUCCESS_CODE, ResultConstant.SUCCESS_MSG, filename);
    }
}

