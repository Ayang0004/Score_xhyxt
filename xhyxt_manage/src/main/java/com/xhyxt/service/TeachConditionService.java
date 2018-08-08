package com.xhyxt.service;

import java.util.List;

import com.xhyxt.pojo.TeachCondition;

public interface TeachConditionService {

	void addInfo(TeachCondition teachCondition);

	List<TeachCondition> queryteachTextbooks(TeachCondition teachCondition);

	TeachCondition queryTextbooksInfo(TeachCondition teachCondition);

	void teachTextooksDelete(String[] ids);

	
	List<TeachCondition> queryteachNet(TeachCondition teachCondition);

	TeachCondition queryNetInfo(TeachCondition teachCondition);

	void teachNetDelete(String[] ids);

	void addNetInfo(TeachCondition teachCondition);

}
