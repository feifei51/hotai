package com.nf.controller;

import com.nf.Admin;
import com.nf.service.IAdminService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/AdminController")
public class AdminController {

    @Resource
    private IAdminService adminService;

    @PostMapping(value = "/login")
    public String login(Admin admin){
        return  adminService.login(admin);
    }
}
