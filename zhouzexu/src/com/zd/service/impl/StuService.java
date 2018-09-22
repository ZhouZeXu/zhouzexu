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
	//��ѯȫ��
	public List<stu> stulist(stu stu) {
		return studao.stulist(stu);
	}
	//ɾ��
	public void delete(int sid) {
		studao.delete(sid);
	}
	//���
	public void add(stu stu) {
		studao.add(stu);
	}
	//��ѯ����
	public stu SelOne(int sid) {
		return studao.SelOne(sid);
	}
	//�޸�
	public void update(stu stu) {
		studao.update(stu);
	}

	
}
