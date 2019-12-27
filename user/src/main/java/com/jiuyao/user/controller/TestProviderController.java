package com.jiuyao.user.controller;

import com.jiuyao.api.entity.User;
import com.jiuyao.redis.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: cps-cloud
 * @ClassName TestProviderController
 * @description:
 * @author: lls
 * @create: 2019-12-26 21:29
 * @Version 1.0
 **/
@RestController
public class TestProviderController {

    @Value("${server.port}")
    private String port;

//    @Resource
//    private RedisUtil redisUtil;

    @RequestMapping("/test")
    public String test(){
//        User user = new User();
//        user.setAge("123");
//        System.out.println(user);
//        redisUtil.set("name","zhangsan");
//        String name = redisUtil.get("name").toString();
//        return "my name is test 服务提供者"+port+name;
//        return "my name is test 服务提供者"+port;
        return null;
    }
}
