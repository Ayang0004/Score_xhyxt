package com.xhyxt.service;

import java.util.List;

import com.xhyxt.pojo.Student;

public interface StudentService {

	/**
	 * 学生登录校验
	 * @param stuNum
	 * @param password
	 */
	Student login(String stuNum, String password);

	/**
	 * AJax校验用户名
	 * @param username
	 * @return
	 */
	boolean checkstuNum(String stuNum);
	/**
	 * 邮箱校验
	 * @param email
	 * @return
	 */
	boolean checkEmail(String email);
	/**
	 * 注册
	 * @param student
	 * @return
	 */
	boolean regist(Student student);

	void addUserName(Student student);

	List<Student> queryStudentList(Student student);

	Student findById(String id);

	void updateStudent(Student student);

	void studentDelete(String[] ids);

}
