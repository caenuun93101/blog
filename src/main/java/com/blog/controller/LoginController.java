package com.blog.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.common.annotation.RequireLogin;
import com.blog.entity.User;

@RestController
public class LoginController
{
	@RequestMapping("/login")
	public User login(HttpServletRequest request, HttpServletResponse response)
	{
		User user=new User();
		user.setId(1);
		user.setImagePath("path");
		user.setName("an");
		user.setPwd("123");
		user.setSign("sign");
		user.setUid("uid");
		return user;
	}
	
	@RequireLogin
	@RequestMapping("/loginout")
	public void loginOut(HttpServletRequest request, HttpServletResponse response)
	{
		
	}
}
