package com.zd.dao;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.zd.entity.users;

public interface IUsersDao {
	
	@Select("select * from users where uname=#{uname} and upwd=#{upwd}")
	@ResultMap("users")
	public users login(users users);
}
