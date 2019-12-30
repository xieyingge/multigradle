package com.example.gradleDemo.controller;


import com.example.gradleDemo.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/allUser")
    public Object getAllUser(){
      log.info("allUser, 被调用了！！！！");
        return sysUserService.selectList();
    }


    @RequestMapping("/updateUser")
    public Object updateUser(@RequestParam String email){
        log.info("updateUser, 被调用了！！！！");
        return sysUserService.updateUser(email);
    }


}
