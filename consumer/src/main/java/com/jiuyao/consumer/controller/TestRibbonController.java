package com.jiuyao.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cps-cloud
 * @ClassName TestRibbonController
 * @description:
 * @author: lls
 * @create: 2019-12-26 21:39
 * @Version 1.0
 **/
@RestController
public class TestRibbonController {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/test")
    public String test(){
        return restTemplate.getForObject("http://User/test",String.class);
    }
}
