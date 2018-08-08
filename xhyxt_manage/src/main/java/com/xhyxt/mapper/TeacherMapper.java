package com.xhyxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.xhyxt.pojo.Teacher;

@Repository
public interface TeacherMapper {

	@Select("select * from tb_teacher where teachNum=#{teachNum} and password=#{password}")
	Teacher login(@Param("teachNum")String teachNum, @Param("password")String password);

	@Select("select * from tb_teacher where teachNum=#{teachNum}")
	boolean checkTeachNum(String teachNum);
	
	@Select("select * from tb_teacher where email=#{email}")
	boolean checkEmail(String email);
	
	@Insert ("insert into tb_teacher (teachNum,relname,password,password2,email,createDate) values (#{teacher.teachNum},#{teacher.relname},#{teacher.password},#{teacher.password2},#{teacher.email},#{teacher.createDate})")
	boolean regist(@Param("teacher")Teacher teacher);

	@Insert ("insert into tb_teacher (teachNum,relname,password,password2,email,createDate) values (#{teacher.teachNum},#{teacher.relname},#{teacher.password},#{teacher.password2},#{teacher.email},#{teacher.createDate})")
	void addTeacher(@Param("teacher")Teacher teacher);
	
	@Select("select * from tb_teacher order by createDate desc")
	List<Teacher> queryTeacherList(@Param("teacher")Teacher teacher);
	
	@Select("select * from tb_teacher where id=#{id}")
	Teacher findById(String id);
	
	@Update("update tb_teacher set teachNum=#{teacher.teachNum},relname=#{teacher.relname},password=#{teacher.password},password2=#{teacher.password2},email=#{teacher.email},createDate=#{teacher.createDate} where id=#{teacher.id}")
	void updateTeacher(@Param("teacher")Teacher teacher);

	void teacherDelete(String[] ids);
}
