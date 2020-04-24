package com.cdmu.controller;

import com.cdmu.constant.ResultObj;
import com.cdmu.model.ActiveUser;
import com.cdmu.utils.SessionUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author BenOniShi
 * @date 2020/4/21 22:43
 */
@RequestMapping("/login")
@Controller
public class LoginController {

    /**
     * 登录方法
     */
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    @ResponseBody
    public ResultObj doLogin(String userName, String userPwd) {
        Subject subject = SecurityUtils.getSubject();
        AuthenticationToken token = new UsernamePasswordToken(userName, userPwd);
        try {
            subject.login(token);
            ActiveUser user = (ActiveUser) subject.getPrincipal();
            HttpSession session = SessionUtil.getSession();
            session.setMaxInactiveInterval(60 * 60 * 12);
            session.setAttribute("user", user.getUser());
            return ResultObj.LOGIN_SUCCESS;
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return ResultObj.LOGIN_ERROR_PASS;
        }
    }


    /**
     * 退出 删除session 返回成功信息
     *
     * @return
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logOut() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "login";
    }


}
