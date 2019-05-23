package com.xiao.learn.service.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by guoxiaoxiao on 2019/5/23.
 * Desc：
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name="+name,String.class);
    }

}
