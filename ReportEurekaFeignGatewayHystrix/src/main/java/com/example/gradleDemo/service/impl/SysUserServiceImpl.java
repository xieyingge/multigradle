package com.example.gradleDemo.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.example.gradleDemo.service.DataClient;
import com.example.gradleDemo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private DataClient dataClient;

    @Override
    @LcnTransaction
    public int updateUser(String email) {
        try {
            dataClient.updateUserCity(email);
            dataClient.updateUserData(email);
        } catch (Exception e) {
//            throw new RuntimeException("抛出异常");
        }
        return 666;
    }
}
