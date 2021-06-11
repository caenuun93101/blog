package com.blog.controller.index;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController
{
	@RequestMapping("/")
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView mav=new ModelAndView("common/index");
		
		return mav;
	}
}
