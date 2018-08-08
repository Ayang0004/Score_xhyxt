package com.xhyxt.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhyxt.mapper.TeachMethodMapper;
import com.xhyxt.pojo.TeachMethod;
import com.xhyxt.service.TeachMethodService;
@Service
public class TeachMethodServiceImp implements TeachMethodService{

	@Autowired
	private TeachMethodMapper teachMethodMapper;
	@Override
	public void addInfo(TeachMethod teachMethod) {
		teachMethod.setCreated(new Date());
		teachMethodMapper.addInfo(teachMethod);
	}

	@Override
	public List<TeachMethod> queryteachEffect(TeachMethod teachMethod) {
		return teachMethodMapper.queryteachEffect(teachMethod);
	}

	@Override
	public TeachMethod queryMethodInfo(TeachMethod teachMethod) {
		return teachMethodMapper.queryMethodInfo(teachMethod);
	}

	@Override
	public void teachmethodDelete(String[] ids) {
		teachMethodMapper.teachmethodDelete(ids);
	}

}
