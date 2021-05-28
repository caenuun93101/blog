package com.blog.common.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.blog.common.annotation.RequireLogin;
import com.blog.entity.User;

/**
 * 登录拦截器
 * @author hj
 */
public class LoginInterceptor extends HandlerInterceptorAdapter
{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
	{
		//先从方法上取注解
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		RequireLogin require=handlerMethod.getMethod().getAnnotation(RequireLogin.class);
		//没有的话就从类上取
		if(require==null) require=handlerMethod.getBeanType().getAnnotation(RequireLogin.class);
		
		//需要验证登录
		if(require!=null&&require.value())
		{
			HttpSession session=request.getSession();
			User user=(User) session.getAttribute("user");
			if(user==null)
			{
				request.getRequestDispatcher("/login").forward(request, response);
				return false;
			}
			return true;
		}
		return true;
	}
}
