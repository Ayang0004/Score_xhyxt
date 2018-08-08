package com.xhyxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.xhyxt.pojo.Student;

@Repository
public interface StudentMapper {
	
	@Select("select * from tb_student where stuNum=#{stuNum} and password=#{password}")
	Student login(@Param("stuNum") String stuNum,@Param("password") String password);
	
	@Select("select * from tb_student where stuNum=#{stuNum}")
	boolean checkstuNum(String stuNum);
	
	@Select("select * from tb_student where email=#{email}")
	boolean checkEmail(String email);
	
	@Insert ("insert into tb_student (stuNum,relname,password,password2,email,createDate) values (#{student.stuNum},#{student.relname},#{student.password},#{student.password2},#{student.email},#{student.createDate})")
	boolean regist(@Param("student")Student student);
	
	@Insert ("insert into tb_student (stuNum,relname,password,password2,email,createDate) values (#{student.stuNum},#{student.relname},#{student.password},#{student.password2},#{student.email},#{student.createDate})")
	void addUserName(@Param("student")Student student);
	
	@Select("select * from tb_student order by createDate desc")
	List<Student> queryStudentList(@Param("student")Student student);

	@Select("select * from tb_student where id=#{id}")
	Student findById(String id);
	
	@Update("update tb_student set stuNum=#{student.stuNum},relname=#{student.relname},password=#{student.password},password2=#{student.password2},email=#{student.email},createDate=#{student.createDate} where id=#{student.id}")
	void updateStudent(@Param("student")Student student);

	void studentDelete(String[] ids);
}
