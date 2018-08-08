package com.xhyxt.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhyxt.mapper.TeacherMapper;
import com.xhyxt.pojo.Teacher;
import com.xhyxt.service.TeacherService;

@Service
public class TeacherServiceImp implements TeacherService{

	@Autowired
	private TeacherMapper teacherMapper;
	
	@Override
	public Teacher login(String teachNum, String password) {
		return teacherMapper.login(teachNum,password);
	}

	@Override
	public boolean checkTeachNum(String teachNum) {
		return teacherMapper.checkTeachNum(teachNum);
	}

	@Override
	public boolean checkEmail(String email) {
		return teacherMapper.checkEmail(email);
	}

	@Override
	public boolean regist(Teacher teacher) {
		teacher.setCreateDate(new Date());
		return teacherMapper.regist(teacher);
	}

	@Override
	public void addTeacher(Teacher teacher) {
		teacher.setCreateDate(new Date());
		teacherMapper.addTeacher(teacher);
	}

	@Override
	public List<Teacher> queryTeacherList(Teacher teacher) {
		return teacherMapper.queryTeacherList(teacher);
	}

	@Override
	public Teacher findById(String id) {
		return teacherMapper.findById(id);
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		teacher.setCreateDate(new Date());
		teacherMapper.updateTeacher(teacher);
	}

	@Override
	public void teacherDelete(String[] ids) {
		teacherMapper.teacherDelete(ids);
	}

}
