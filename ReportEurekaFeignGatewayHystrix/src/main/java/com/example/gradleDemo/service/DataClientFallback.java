package com.example.gradleDemo.service;

import com.example.gradleDemo.entity.City;
import com.example.gradleDemo.entity.WeatherResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataClientFallback implements DataClient {


    @Override
    public List<City> listCity() throws Exception {
        List<City> cityList = null;
        cityList = new ArrayList<>();

        City city = new City();
        city.setCityId("101280601");
        city.setCityName("深圳");
        cityList.add(city);

        city = new City();
        city.setCityId("101280301");
        city.setCityName("惠州");
        cityList.add(city);

        return cityList;
    }

    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        return null;
    }

    @Override
    public Object updateUserCity(String email) throws Exception {
        return "失败";
    }

    @Override
    public Object updateUserData(String email) throws Exception {
        return "失败";
    }
}
