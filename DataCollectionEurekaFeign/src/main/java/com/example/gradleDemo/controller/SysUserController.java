package com.example.gradleDemo.controller;


import com.example.gradleDemo.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/allUser")
    public Object getAllUser(){
        return sysUserService.selectList();
    }

    @RequestMapping("/cityService/allUser")
    public Object getAllUserFromCityService(){
        return sysUserService.selectListFromCityService();
    }


    @RequestMapping("/updateUser")
    public Object updateUser(String email){

        return sysUserService.updateUser(email);
    }

}
