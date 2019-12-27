package com.jiuyao.user.service;

import com.jiuyao.api.entity.User;

import java.util.List;

/**
 * @program: cps-cloud
 * @ClassName UserService
 * @description:
 * @author: lls
 * @create: 2019-12-27 11:19
 * @Version 1.0
 **/
public interface UserService {
    List<User> getAll();
}
