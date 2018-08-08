package com.xhyxt.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhyxt.mapper.OutLineMapper;
import com.xhyxt.pojo.FileUploads;
import com.xhyxt.service.OutLineService;

@Service
public class OutLineServiceImp implements OutLineService{

	@Autowired
	private OutLineMapper outLineMapper;
	@Override
	public void addInfo(FileUploads fileUploads) {
		fileUploads.setCreated(new Date());
		fileUploads.setUpdated(new Date());
		outLineMapper.addInfo(fileUploads);
	}
	@Override
	public List<FileUploads> queryFile(FileUploads fileUploads) {
		return outLineMapper.queryPic(fileUploads);
	}
	@Override
	public void outlineDelete(String[] ids) {
		outLineMapper.outlineDelete(ids);
	}

}
