/*      						
 * Copyright 2010 Beijing Xinwei, Inc. All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2018年1月12日	| lipengfeia 	| 	create the file                       
 */

package com.thinker.cal.service.impl;

/**
 * 
 * 类简要描述
 * 
 * <p>
 * 类详细描述
 * </p> 
 * 
 * @author lipengfeia
 * 
 */

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RedisService {

	@Autowired
	StringRedisTemplate stringRedisTemplate;

	/**
	 * 根据指定key获取String
	 * 
	 * @param key
	 * @return
	 */
	public String getStr(String key) {
		return stringRedisTemplate.opsForValue().get(key);

	}

	/**
	 * 设置Str缓存
	 * 
	 * @param key
	 * @param val
	 */
	public void setStr(String key, String val) {
		stringRedisTemplate.opsForValue().set(key, val);
	}

	/**
	 * 设置带有生命周期的缓存
	 * 
	 * @param key
	 * @param val
	 * @param timeout
	 */
	public void setStr(String key, String val, int timeout) {
		stringRedisTemplate.opsForValue().set(key, val, timeout,
				TimeUnit.SECONDS);
	}

	/**
	 * 删除指定key
	 * 
	 * @param key
	 */
	public void del(String key) {
		stringRedisTemplate.delete(key);
	}

}