package com.zd.service;

import java.util.List;

import com.zd.entity.stu;

public interface IStuService {

	
	//��ѯȫ��
	public List<stu> stulist(stu stu);
	
	//ɾ��
	public void delete(int sid);
	
	//���
	public void add(stu stu);
	
	//��ѯ����
	public stu SelOne(int sid);
	
	//�޸�
	public void update(stu stu);
}
