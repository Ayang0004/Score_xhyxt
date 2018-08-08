package com.xhyxt.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhyxt.mapper.CoursewareMapper;
import com.xhyxt.pojo.CoursewareUp;
import com.xhyxt.pojo.TeahplayUp;
import com.xhyxt.service.CoursewareService;

@Service
public class CoursewareServiceImp implements CoursewareService {
	
	@Autowired
	private CoursewareMapper coursewareMapper;
	@Override
	public void addInfo(CoursewareUp coursewareUp) {
		coursewareUp.setCreated(new Date());
		coursewareUp.setUpdated(new Date());
		coursewareMapper.addInfo(coursewareUp);
	}

	@Override
	public List<CoursewareUp> queryFile(CoursewareUp coursewareUp) {
		return coursewareMapper.queryFile(coursewareUp);
	}

	@Override
	public void courseDelete(String[] ids) {
		coursewareMapper.courseDelete(ids);
	}

	@Override
	public TeahplayUp queryById(int id) {
		return coursewareMapper.queryById(id);
	}

}
