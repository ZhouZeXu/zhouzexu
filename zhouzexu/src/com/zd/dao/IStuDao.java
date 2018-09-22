package com.zd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zd.entity.stu;

public interface IStuDao {

	
	//��ѯȫ��
	@Select("select * from stu")
	@ResultMap("stu")
	public List<stu> stulist(stu stu);
	
	//ɾ��
	@Delete("delete from stu where sid= #{sid}")
	public void delete(int sid);
	
	//���
	@Insert("insert into stu values(null,#{sname},#{ssex},#{sage},#{stel})")
	public void add(stu stu);
	
	//��ѯ����
	@Select("select * from stu where sid=#{sid}")
	@ResultMap("stu")
	public stu SelOne(int sid);
	
	//�޸�
	@Update("update stu set sname=#{sname},ssex=#{ssex},sage=#{sage},stel=#{stel} where sid=#{sid}")
	public void update(stu stu);
}
