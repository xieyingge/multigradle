package com.example.gradleDemo.dao;

import com.example.gradleDemo.entity.SysUser;

import java.util.List;

public interface SysUserDao {
    List<SysUser> selectList();

    int updateUser(String email);
}
