package com.example.gradleDemo.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.example.gradleDemo.dao.SysUserDao;
import com.example.gradleDemo.entity.SysUser;
import com.example.gradleDemo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public List<SysUser> selectList() {
        return sysUserDao.selectList();
    }

    @Override
    @LcnTransaction
    public int updateUser(String email) {

         sysUserDao.updateUser(email);
        if (true) {
            throw new RuntimeException("抛出异常");
        }

        return 0;
    }
}
