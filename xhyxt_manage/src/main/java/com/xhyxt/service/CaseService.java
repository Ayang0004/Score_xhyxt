package com.xhyxt.service;

import java.util.List;

import com.xhyxt.pojo.Case;

public interface CaseService {

	void addInfo(Case cases);

	void teachCaseDelete(String[] ids);

	List<Case> queryCaseList(Case cases);

	Case queryCaseContInfo(String id);

	Case queryById(int id);

}
