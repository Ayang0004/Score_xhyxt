package com.xhyxt.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhyxt.mapper.CaseMapper;
import com.xhyxt.pojo.Case;
import com.xhyxt.service.CaseService;

@Service
public class CaseServiceImp  implements CaseService{

	@Autowired
	private CaseMapper caseMapper;
	@Override
	public void addInfo(Case cases) {
		cases.setCreated(new Date());
		caseMapper.addInfo(cases);
	}

	@Override
	public void teachCaseDelete(String[] ids) {
		caseMapper.teachCaseDelete(ids);
	}


	@Override
	public List<Case> queryCaseList(Case cases) {
		return caseMapper.queryCaseList(cases);
	}

	@Override
	public Case queryCaseContInfo(String id) {
		return caseMapper.queryCaseContInfo(id);
	}

	@Override
	public Case queryById(int id) {
		return caseMapper.queryById(id);
	}

}
