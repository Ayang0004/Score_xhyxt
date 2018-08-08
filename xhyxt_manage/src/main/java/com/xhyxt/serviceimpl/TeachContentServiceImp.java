package com.xhyxt.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhyxt.mapper.TeachContentMapper;
import com.xhyxt.pojo.TeachContent;
import com.xhyxt.service.TeachContentService;

@Service
public class TeachContentServiceImp implements TeachContentService {

	@Autowired
	private TeachContentMapper teachContentMapper;
	@Override
	public void addInfo(TeachContent teachContent) {
		teachContent.setCreated(new Date());
		teachContentMapper.addInfo(teachContent);
	}

	@Override
	public List<TeachContent> queryteachTheory(TeachContent teachContent) {
		return teachContentMapper.queryteachTheory(teachContent);
	}

	@Override
	public TeachContent queryTheoryInfo(TeachContent teachContent) {
		return teachContentMapper.queryTheoryInfo(teachContent);
	}

	@Override
	public void teachTheoryDelete(String[] ids) {
		teachContentMapper.teachTheoryDelete(ids);
	}

	@Override
	public void addParcticeInfo(TeachContent teachContent) {
		teachContent.setCreated(new Date());
		teachContentMapper.addParcticeInfo(teachContent);		
	}

	@Override
	public List<TeachContent> queryTeachParctice(TeachContent teachContent) {
		return teachContentMapper.queryTeachParctice(teachContent);
	}

	@Override
	public TeachContent queryParcticeInfo(TeachContent teachContent) {
		return teachContentMapper.queryParcticeInfo(teachContent);
	}

	@Override
	public void teachParcticeDelete(String[] ids) {
		teachContentMapper.teachParcticeDelete(ids);
	}

	@Override
	public void addOrgInfo(TeachContent teachContent) {
		teachContent.setCreated(new Date());
		teachContentMapper.addOrgInfo(teachContent);
	}

	@Override
	public List<TeachContent> queryTeachOrg(TeachContent teachContent) {
		return teachContentMapper.queryTeachOrg(teachContent);
	}

	@Override
	public TeachContent queryOrgInfo(TeachContent teachContent) {
		return teachContentMapper.queryOrgInfo(teachContent);
	}

	@Override
	public void teachOrgDelete(String[] ids) {
		teachContentMapper.	teachOrgDelete(ids);	
	}

}
