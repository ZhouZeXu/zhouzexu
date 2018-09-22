package com.zd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zd.dao.IStuDao;
import com.zd.entity.stu;
import com.zd.service.IStuService;

@Service
public class StuService implements IStuService {

	@Autowired
	private IStuDao studao;
	//查询全部
	public List<stu> stulist(stu stu) {
		return studao.stulist(stu);
	}
	//删除
	public void delete(int sid) {
		studao.delete(sid);
	}
	//添加
	public void add(stu stu) {
		studao.add(stu);
	}
	//查询单条
	public stu SelOne(int sid) {
		return studao.SelOne(sid);
	}
	//修改
	public void update(stu stu) {
		studao.update(stu);
	}

	
}
