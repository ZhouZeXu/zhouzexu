package com.zd.controller;

import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zd.entity.users;
import com.zd.service.IUsersService;


@Controller
public class UsersController {

	
	@Autowired
	private IUsersService usersService;
	
	
	@RequestMapping("/tologin")
	public String tologin(){
		return "login";
	}
	@RequestMapping("/login")
	public String login(users users,HttpSession session){
		org.slf4j.Logger log = LoggerFactory.getLogger(UsersController.class);
		try {
			users u = usersService.login(users);
			if(u!=null){
				session.setAttribute("u", u);
				return "redirect:stu";
			}else{
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			log.error("µÇÂ¼Ê§°Ü",e);
		}
		return "redirect:tologin";
	}
}
