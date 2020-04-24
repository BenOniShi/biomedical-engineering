package com.cdmu.controller;

import com.cdmu.pojo.User;
import com.cdmu.service.IUserRoleService;
import com.cdmu.utils.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @Author: BenOnSHI
 * @Date: 2020/4/21 16:34
 **/
@Controller
public class BaseController {

    public User user;

    public Integer role;

    @Autowired
    private IUserRoleService userRoleService;

    @ModelAttribute
    public void getUserAndRoleId() {
        this.user = (User) SessionUtil.getSessionAttribute("user");
        if (this.user != null) {
            this.role = (Integer) SessionUtil.getSessionAttribute("role");
            if (null == this.role) {
                this.role = userRoleService.queryRoleIdByUserId(this.user.getId());
                SessionUtil.setSessionAttribute("role", this.role);
            }
        }
    }
}
