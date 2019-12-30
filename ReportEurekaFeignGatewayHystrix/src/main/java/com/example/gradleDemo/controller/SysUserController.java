package com.example.gradleDemo.controller;


import com.example.gradleDemo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;



    @RequestMapping("/updateUser")
    public Object updateUser(String email){

        return sysUserService.updateUser(email);
    }

}
