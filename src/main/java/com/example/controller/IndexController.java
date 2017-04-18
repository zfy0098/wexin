package com.example.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.LoginService;

@Controller
public class IndexController {

	
	@Autowired
	private LoginService loginService;
	
	@ResponseBody
	@RequestMapping("/index")
	public Object index(HttpServletRequest request){
		
		Long startTime = System.currentTimeMillis();
		
		System.out.println("开始执行方法");
		
		List<Map<String,Object>> list = loginService.userList();
		
		Long endTime = System.currentTimeMillis();
		
		
		System.out.println((endTime-startTime)/1000 + "秒");
		
		return list;
	}
}
