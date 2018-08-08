package com.xhyxt.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhyxt.mapper.TeachplayMapper;
import com.xhyxt.pojo.TeahplayUp;
import com.xhyxt.service.TeachplayService;

@Service
public class TeachplayServiceImp implements TeachplayService{
	
	@Autowired
	private TeachplayMapper teachplayMapper;

	@Override
	public void addInfo(TeahplayUp teahplayUp) {
		teahplayUp.setCreated(new Date());
		teahplayUp.setUpdated(new Date());
		teachplayMapper.addInfo(teahplayUp);
	}

	@Override
	public List<TeahplayUp> queryFile(TeahplayUp TeahplayUp) {
		return teachplayMapper.queryFile(TeahplayUp);
	}

	@Override
	public void teachDelete(String[] ids) {
		teachplayMapper.teachDelete(ids);
	}

	@Override
	public TeahplayUp queryById(int id) {
		return teachplayMapper.queryById(id);
	}

	

}
