package com.blog.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.blog.common.interceptors.LoginInterceptor;

@Configuration
public class CustomWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter
{
	@Override
	public void addInterceptors(InterceptorRegistry registry)
	{
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**");
		super.addInterceptors(registry);
	}
}
