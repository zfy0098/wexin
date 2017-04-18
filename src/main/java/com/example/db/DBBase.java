package com.example.db;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class DBBase {
	
    @Autowired
    protected JdbcTemplate jdbcTemplate;
    
    @PostConstruct  
    public void init(){
    	System.out.println("执行了这个方法");
    }

}
