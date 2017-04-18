package com.example.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

@Service
public class ClearEhcacheService {

	
	@CacheEvict(value = "sampleCache2" , allEntries = true)
	public void clear(){
		 System.out.println("删除缓存");
	}
}
