package com.zd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zd.dao.IUsersDao;
import com.zd.entity.users;
import com.zd.service.IUsersService;
@Service
public class UsersService implements IUsersService {

	
	@Autowired 
	private IUsersDao userdao;
	
	public users login(users users) {
		return userdao.login(users);
	}

}
