package com.xhyxt.service;

import java.util.List;

import com.xhyxt.pojo.Teacher;


public interface TeacherService {
	
	/**
	 * 教师登录校验
	 * @param teachNum
	 * @param password
	 * @return
	 */
	Teacher login(String teachNum, String password);
	/**
	 * 工号校验
	 * @param stuNum
	 * @return
	 */
	boolean checkTeachNum(String teachNum);
	/**
	 * 邮箱校验
	 * @param email
	 * @return
	 */
	boolean checkEmail(String email);
	
	boolean regist(Teacher teacher);
	
	void addTeacher(Teacher teacher);
	
	List<Teacher> queryTeacherList(Teacher teacher);
	
	Teacher findById(String id);
	
	void updateTeacher(Teacher teacher);
	
	void teacherDelete(String[] ids);

}
