package com.xhyxt.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhyxt.mapper.TeachEffectMapper;
import com.xhyxt.pojo.TeachEffect;
import com.xhyxt.service.TeachEffectService;
@Service
public class TeachEffectServiceImp implements  TeachEffectService {
	
	@Autowired
	private TeachEffectMapper teachEffectMapper;
	@Override
	public void addInfo(TeachEffect teachEffect) {
		teachEffect.setCreated(new Date());
		teachEffectMapper.addInfo(teachEffect);
	}

	@Override
	public List<TeachEffect> queryteachEffect(TeachEffect teachEffect) {
		return teachEffectMapper.queryteachEffect(teachEffect);
	}

	@Override
	public TeachEffect queryEffectInfo(TeachEffect teachEffect) {
		return teachEffectMapper.queryEffectInfo(teachEffect);
	}

	@Override
	public void teachEffectDelete(String[] ids) {
		teachEffectMapper.teachEffectDelete(ids);
	}

}
