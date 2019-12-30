package com.example.gradleDemo.service;

import com.example.gradleDemo.entity.SysUser;

import java.util.List;

public interface SysUserService {

    List<SysUser> selectList();

    int updateUser(String email);
}
