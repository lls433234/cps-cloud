package com.jiuyao.user.mapper;

import com.jiuyao.api.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: cps-cloud
 * @ClassName UserMapper
 * @description:
 * @author: lls
 * @create: 2019-12-27 11:21
 * @Version 1.0
 **/
@Mapper
public interface UserMapper {
    List<User> getAll();
}
