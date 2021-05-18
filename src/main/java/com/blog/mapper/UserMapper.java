package com.blog.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.blog.entity.User;

@Mapper
public interface UserMapper
{
	public User getUserByUidAndPwd(User user);
}
