package com.example.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.LoginService;

@Controller
public class IndexController {

	
	/**
	 * 协议 http 或 https System.out.println("request.getScheme():" +
	 * request.getScheme()); 服务器地址 System.out.println("request.getServerName():"
	 * + request.getServerName()); 服务器端口号
	 * System.out.println("request.getServePort():" + request.getServerPort());
	 * 项目名称 System.out.println("request.getContextPath():" +
	 * request.getContextPath());
	 * 
	 * String url = request.getScheme() + "://" + request.getServerName() + ":"
	 * + request.getServerPort() + request.getContextPath() +
	 * "/register/register.jsp";
	 * 
	 * 
	 * 
	 * request.getLocalAddr();//获取本地IP，即服务器IP
	 * request.getLocalName();//获取本地名称，即服务器名称
	 * request.getLocalPort();//获取本地端口号，即Tomcat端口号
	 * request.getLocale();//用户的语言环境
	 * request.getContextPath();//context路径 
	 * request.getMethod();//GET还是POST
	 * request.getProtocol();//协议，http协议 
	 * request.getQueryString();//查询字符串
	 * request.getRemoteAddr();//远程IP，即客户端IP
	 * request.getRemotePort();//远程端口，即客户端端口
	 * request.getRemoteUser();//远程用户
	 * request.getRequestedSessionId();//客户端的Session的ID
	 * request.getRequestURI();//用户请求的URL 
	 * request.getScheme();//协议头，例如http
	 * request.getServerName();//服务器名称
	 * request.getServerPort();//服务器端口
	 * 
	 * request.getServletPath();//Servlet路径
	 * 
	 * 
	 * 
	 */
	
	@Autowired
	private LoginService loginService;
	
	@ResponseBody
	@RequestMapping("/index/{id}")
	public Object index(HttpServletRequest request,@PathVariable String id){
		
		Long startTime = System.currentTimeMillis();
		
		System.out.println("开始执行方法");
		
		List<Map<String,Object>> list = loginService.userList(id);
		
		Long endTime = System.currentTimeMillis();
		
		System.out.println((endTime-startTime)/1000 + "秒");
		
		return list;
	}
}
