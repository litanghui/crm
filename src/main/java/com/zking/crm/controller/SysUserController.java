package com.zking.crm.controller;

import com.zking.crm.biz.ISysUserBiz;
import com.zking.crm.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class SysUserController {
    @Autowired
    private ISysUserBiz sysUserBiz;
    private HttpServletRequest request;

    @ModelAttribute
    public void init(Model model, @ModelAttribute SysUser sysUser, HttpServletRequest request) {
        model.addAttribute("sysUser", sysUser);
    }

    @RequestMapping("/login")
    public String login(Model model, @ModelAttribute SysUser sysUser, HttpServletRequest request) {
        SysUser u = sysUserBiz.loginSysUser(sysUser);
        if (u == null) {
            request.setAttribute("sysUser", sysUser);
            request.setAttribute("errorMsg", "用户名或密码错误！");
            return "login";
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("currentUser", sysUser);
            return "main";
        }

    }

    @RequestMapping("/reg")
    public String reg(Model model, @ModelAttribute SysUser sysUser, HttpServletRequest request, Errors errors) {
        System.out.println(sysUser);
//        request.setAttribute("message1","login fail");
//        model.addAttribute("message2", "login fail2");
//        errors.rejectValue("userAccount", null, "账号不能重复");
        SysUser u = sysUserBiz.loginSysUser(sysUser);
        if (null != u) {
            System.out.println("账号已存在，请使用其它账号名注册");
            errors.rejectValue("userAccount", null, "账号已存在，请使用其它账号名注册");
        } else {
            System.out.println("login");
        }

        return "main";

}

}