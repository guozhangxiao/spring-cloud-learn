package com.xiao.learn.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guoxiaoxiao on 2019/6/12.
 * Desc：
 */
@SpringBootApplication
@RestController
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @Value("${foo}")
    String foo;

    @Value("${democonfigclient.message}")
    String message;
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo+"-"+message;
    }
}
