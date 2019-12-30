package com.example.gradleDemo.service;

import com.example.gradleDemo.entity.City;
import com.example.gradleDemo.entity.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("micro-weather-city-eureka")
public interface CityClient {

    @GetMapping("/city/listCity")
    List<City> cityList();


    @GetMapping("/allUser")
    List<SysUser> allUser();

    @GetMapping("/updateUser")
    int updateUser(@RequestParam("email") String email);

}
