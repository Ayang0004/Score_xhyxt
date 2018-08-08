package com.xhyxt.service;

import java.util.List;

import com.xhyxt.pojo.TeahplayUp;

public interface TeachplayService {

	void addInfo(TeahplayUp TeahplayUp);

	List<TeahplayUp> queryFile(TeahplayUp teahplayUp);

	void teachDelete(String[] ids);

	TeahplayUp queryById(int id);

}
