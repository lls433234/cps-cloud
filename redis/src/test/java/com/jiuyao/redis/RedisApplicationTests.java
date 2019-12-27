package com.jiuyao.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest

class RedisApplicationTests {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    void contextLoads() {
    }

}
