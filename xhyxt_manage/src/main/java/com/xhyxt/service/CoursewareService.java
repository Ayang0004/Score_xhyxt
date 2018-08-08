package com.xhyxt.service;

import java.util.List;

import com.xhyxt.pojo.CoursewareUp;
import com.xhyxt.pojo.TeahplayUp;

public interface CoursewareService {

	void addInfo(CoursewareUp coursewareUp);

	List<CoursewareUp> queryFile(CoursewareUp coursewareUp);

	void courseDelete(String[] ids);

	TeahplayUp queryById(int id);

}
