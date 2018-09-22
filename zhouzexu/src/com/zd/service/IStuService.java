package com.zd.service;

import java.util.List;

import com.zd.entity.stu;

public interface IStuService {

	
	//查询全部
	public List<stu> stulist(stu stu);
	
	//删除
	public void delete(int sid);
	
	//添加
	public void add(stu stu);
	
	//查询单条
	public stu SelOne(int sid);
	
	//修改
	public void update(stu stu);
}
