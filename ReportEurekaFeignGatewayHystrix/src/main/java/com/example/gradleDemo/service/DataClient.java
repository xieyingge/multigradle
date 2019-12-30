package com.example.gradleDemo.service;

import com.example.gradleDemo.entity.City;
import com.example.gradleDemo.entity.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "msa-weather-eureka-client-zuul",fallback = DataClientFallback.class)
public interface DataClient {

    /**
     * 获取城市列表
     * @return
     * @throws Exception
     */
    @GetMapping("/city/city/listCity")
    List<City> listCity() throws Exception;

    /**
     * 根据城市ID查询天气数据
     */
    @GetMapping("/data/weather/cityId/{cityId}")
    WeatherResponse getDataByCityId(@PathVariable("cityId") String cityId);

    @GetMapping("/city/updateUser")
    Object updateUserCity(@RequestParam("email") String email) throws Exception;

    @GetMapping("/data/updateUser")
    Object updateUserData(@RequestParam("email") String email) throws Exception;


}
