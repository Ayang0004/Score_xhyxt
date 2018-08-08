package com.xhyxt.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhyxt.mapper.TeachConditionMapper;
import com.xhyxt.pojo.TeachCondition;
import com.xhyxt.service.TeachConditionService;

@Service
public class TeachConditionServiceImp implements TeachConditionService{

	
	@Autowired
	private TeachConditionMapper teachConditionMapper;
	@Override
	public void addInfo(TeachCondition teachCondition) {
		teachCondition.setCreated(new Date());
		teachConditionMapper.addInfo(teachCondition);		
	}

	@Override
	public List<TeachCondition> queryteachTextbooks(TeachCondition teachCondition) {
		return teachConditionMapper.queryteachTextbooks(teachCondition);
	}

	@Override
	public TeachCondition queryTextbooksInfo(TeachCondition teachCondition) {
		return teachConditionMapper.queryTextbooksInfo(teachCondition);
	}

	@Override
	public void teachTextooksDelete(String[] ids) {
		teachConditionMapper.teachTextooksDelete(ids);
	}

	@Override
	public List<TeachCondition> queryteachNet(TeachCondition teachCondition) {
		return teachConditionMapper.queryteachNet(teachCondition);
	}

	@Override
	public TeachCondition queryNetInfo(TeachCondition teachCondition) {
		return teachConditionMapper.queryNetInfo(teachCondition);
	}

	@Override
	public void teachNetDelete(String[] ids) {
		teachConditionMapper.teachNetDelete(ids);
	}

	@Override
	public void addNetInfo(TeachCondition teachCondition) {
		teachCondition.setCreated(new Date());
		teachConditionMapper.addNetInfo(teachCondition);
	}

}
