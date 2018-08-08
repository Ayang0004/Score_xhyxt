package com.xhyxt.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhyxt.mapper.CourseIntrodMapper;
import com.xhyxt.pojo.CourseIntrod;
import com.xhyxt.service.CourseIntrodService;

@Service
public class CourseIntrodImp implements CourseIntrodService{

	@Autowired
	private CourseIntrodMapper courseIntrodMapper;
	@Override
	public void addInfo(CourseIntrod courseIntrod) {
		courseIntrod.setCreated(new Date());
		courseIntrodMapper.addInfo(courseIntrod);
	}

	@Override
	public List<CourseIntrod> queryCourseIntrod(CourseIntrod courseIntrod) {
		return courseIntrodMapper.queryCourseIntrod(courseIntrod);
	}

	@Override
	public CourseIntrod queryIntrodInfo(CourseIntrod courseIntrod) {
		return courseIntrodMapper.queryIntrodInfo(courseIntrod);
	}

	@Override
	public void CourseIntrodDelete(String[] ids) {
		courseIntrodMapper.CourseIntrodDelete(ids);
	}

	@Override
	public void addFeaturesInfo(CourseIntrod courseIntrod) {
		courseIntrod.setCreated(new Date());
		courseIntrodMapper.addFeaturesInfo(courseIntrod);
	}

	@Override
	public List<CourseIntrod> queryCourseFeatures(CourseIntrod courseIntrod) {
		return courseIntrodMapper.queryCourseFeatures(courseIntrod);
	}

	@Override
	public void CourseFeaturesDelete(String[] ids) {
		courseIntrodMapper.CourseFeaturesDelete(ids);
	}

	@Override
	public CourseIntrod queryFeaturesInfo(CourseIntrod courseIntrod) {
		return courseIntrodMapper.queryFeaturesInfo(courseIntrod);
	}

	@Override
	public void addHistoryInfo(CourseIntrod courseIntrod) {
		courseIntrod.setCreated(new Date());
		courseIntrodMapper.addHistoryInfo(courseIntrod);
	}

	@Override
	public List<CourseIntrod> queryCourseHistory(CourseIntrod courseIntrod) {
		return courseIntrodMapper.queryCourseHistory(courseIntrod);
	}

	@Override
	public CourseIntrod queryHistoryInfo(CourseIntrod courseIntrod) {
		return courseIntrodMapper.queryHistoryInfo(courseIntrod);
	}

	@Override
	public void CourseHistoryDelete(String[] ids) {
		courseIntrodMapper.CourseHistoryDelete(ids);
	}

}
