package com.jiuyao.user.service.impl;

import com.jiuyao.api.entity.User;
import com.jiuyao.user.mapper.UserMapper;
import com.jiuyao.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: cps-cloud
 * @ClassName UserServiceImpl
 * @description:
 * @author: lls
 * @create: 2019-12-27 11:20
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        List<User> all = userMapper.getAll();
        return all;
    }
}
