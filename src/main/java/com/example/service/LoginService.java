package com.example.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.db.LoginDB;

@CacheConfig(cacheNames = "sampleCache2")
@Service
public class LoginService  {

	@Autowired
	private LoginDB loginDB;
	 
	@Cacheable(key = "#id")
	public List<Map<String,Object>> userList(String id){
		return loginDB.userList(id);
	}
}
