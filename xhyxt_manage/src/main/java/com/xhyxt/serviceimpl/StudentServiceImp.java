package com.xhyxt.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhyxt.mapper.StudentMapper;
import com.xhyxt.pojo.Student;
import com.xhyxt.service.StudentService;
@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentMapper studentMapper;
	@Override
	public Student login(String stuNum, String password) {
		return studentMapper.login(stuNum,password);
	}

	@Override
	public boolean checkstuNum(String stuNum) {
		return studentMapper.checkstuNum(stuNum);
	}

	@Override
	public boolean checkEmail(String email) {
		return studentMapper.checkEmail(email);
	}

	@Override
	public boolean regist(Student student) {
		student.setCreateDate(new Date());
		student.setCreateTime(new Date());
		return studentMapper.regist(student);
	}

	@Override
	public void addUserName(Student student) {
		student.setCreateDate(new Date());
		studentMapper.addUserName(student);
	}

	@Override
	public List<Student> queryStudentList(Student student) {
		return studentMapper.queryStudentList(student);
	}

	@Override
	public Student findById(String id) {
		return studentMapper.findById(id);
	}

	@Override
	public void updateStudent(Student student) {
		student.setCreateDate(new Date());
		studentMapper.updateStudent(student);
	}

	@Override
	public void studentDelete(String[] ids) {
		studentMapper.studentDelete(ids);
	}

}
