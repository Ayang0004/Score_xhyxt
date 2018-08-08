package com.xhyxt.service;

import java.util.List;

import com.xhyxt.pojo.CourseIntrod;

public interface CourseIntrodService {

	void addInfo(CourseIntrod courseIntrod);

	List<CourseIntrod> queryCourseIntrod(CourseIntrod courseIntrod);

	CourseIntrod queryIntrodInfo(CourseIntrod courseIntrod);

	void CourseIntrodDelete(String[] ids);

	void addFeaturesInfo(CourseIntrod courseIntrod);

	List<CourseIntrod> queryCourseFeatures(CourseIntrod courseIntrod);

	void CourseFeaturesDelete(String[] ids);

	CourseIntrod queryFeaturesInfo(CourseIntrod courseIntrod);

	void addHistoryInfo(CourseIntrod courseIntrod);

	List<CourseIntrod> queryCourseHistory(CourseIntrod courseIntrod);

	CourseIntrod queryHistoryInfo(CourseIntrod courseIntrod);

	void CourseHistoryDelete(String[] ids);

}
