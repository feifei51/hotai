package com.nf.controller;

import com.nf.service.IUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/UserController")
public class UserController {

    @Resource
    private IUserService userService;

}
