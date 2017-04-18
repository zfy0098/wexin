package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ClearEhcacheService;


@RestController
@RequestMapping("/clearcache")
public class ClearCacheController{

	@Autowired
	private ClearEhcacheService clearEhcacheService;
	
	@RequestMapping("")
	public Object ClearCache(){
		clearEhcacheService.clear();
		return "SUCCESS";
	}
}
