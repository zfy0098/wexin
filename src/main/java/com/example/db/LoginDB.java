package com.example.db;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class LoginDB  extends DBBase{

	public List<Map<String,Object>> userList(String id){
		System.err.println("查询数据库");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		String sql = "select * from tab_loginuser where id=?";
		return jdbcTemplate.queryForList(sql , new Object[]{id});
	}
}
