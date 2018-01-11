package com.lx.pop;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;


/**
 * Description
 * ProjectName pop
 * Created by lucy on 2017/12/28 17:38.
 * Version 1.0
 */
@Service
public class RedisUtil {



    public RedisTemplate<String, Object> redisTemplate;



    /**
     * 缓存基本的对象，Integer、String、实体类等
     * @param key    缓存的键值
     * @param value    缓存的值
     * @return        缓存的对象
     */
    public void setCacheObject(String key, Object value) {
        redisTemplate.opsForValue().set(key,value);
    }



    /**
     * 获得缓存的基本对象。
     * @param key        缓存键值
     * @return            缓存键值对应的数据
     */
    public Object getCacheObject(String key) {
        return redisTemplate.opsForValue().get(key);

//        return null;
    }






}
