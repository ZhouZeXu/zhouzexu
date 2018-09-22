package com.zd.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zd.entity.stu;
import com.zd.service.IStuService;

@Controller
public class stuController {

	
	@Autowired
	private IStuService stuservice;
	
	private List<stu> stulist;
	public List<stu> getStulist() {
		return stulist;
	}
	public void setStulist(List<stu> stulist) {
		this.stulist = stulist;
	}

	//查询全部
	@RequestMapping("/stu")
	public String stu(stu stu,Map map){
		Logger log = LoggerFactory.getLogger(stuController.class);
		try {
			stulist = stuservice.stulist(stu);
			map.put("slist", stulist);
			return "stu";
			
		} catch (Exception e) {
			e.printStackTrace();
			log.error("查询失败",e);
		}
		return "stu";
	}
	
	//删除
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(int sid){
		Logger log = LoggerFactory.getLogger(stuController.class);
		try {
		stuservice.delete(sid);
		return "1";
		} catch (Exception e) {
			e.printStackTrace();
			log.error("查询失败",e);
		}
		return "1";
	}
	
	@RequestMapping("/toadd")
	public String tologin(){
		return "add";
	}
	//添加
	@RequestMapping("/add")
	public String add(stu stu){
		Logger log = LoggerFactory.getLogger(stuController.class);
		try {
		stuservice.add(stu);
		return "redirect:stu";
		} catch (Exception e) {
			e.printStackTrace();
			log.error("查询失败",e);
		}
		return "redirect:stu";
	}
	
	//查询单条
	@RequestMapping("/SelOne")
	public String SelOne(int sid,Map map){
		Logger log = LoggerFactory.getLogger(stuController.class);
		try {
		map.put("stu", stuservice.SelOne(sid));
		return "Update";
		} catch (Exception e) {
			e.printStackTrace();
			log.error("查询失败",e);
		}
		return "Update";
	}
	
	//修改
	@RequestMapping("/update")
	public String update(stu stu){
		Logger log = LoggerFactory.getLogger(stuController.class);
		try {
		stuservice.update(stu);
		return "redirect:stu";
		} catch (Exception e) {
			e.printStackTrace();
			log.error("查询失败",e);
		}
		return "redirect:stu";
	}
}
