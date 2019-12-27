package com.jiuyao.user.controller;

import com.jiuyao.api.entity.User;
import com.jiuyao.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: cps-cloud
 * @ClassName TestController
 * @description:
 * @author: lls
 * @create: 2019-12-27 11:18
 * @Version 1.0
 **/
@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/testDB")
    public String test(){
        List<User> all = userService.getAll();
        System.out.println(all);
        return all.toString();
    }
}
