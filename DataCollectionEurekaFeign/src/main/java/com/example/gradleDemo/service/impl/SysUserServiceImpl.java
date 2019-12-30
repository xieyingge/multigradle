package com.example.gradleDemo.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.example.gradleDemo.dao.SysUserDao;
import com.example.gradleDemo.entity.SysUser;
import com.example.gradleDemo.service.CityClient;
import com.example.gradleDemo.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Autowired
    private CityClient cityClient;


    @Override
    public List<SysUser> selectList() {
        return sysUserDao.selectList();
    }


    @Override
//    @Transactional
    @LcnTransaction
    public int updateUser(String email) {
        log.info("调用 city eureka 的 更新用户，掉用参数加上 from collection feign");
        cityClient.updateUser(email + " from collection feign");

        log.info("调用 本地 的更新！！");
        sysUserDao.updateUser(email);
        if (true) {
            throw new RuntimeException("抛出运行时异常");
        }
        return 1;
    }

    @Override
    public List<SysUser> selectListFromCityService() {
        return cityClient.allUser();
    }
}
