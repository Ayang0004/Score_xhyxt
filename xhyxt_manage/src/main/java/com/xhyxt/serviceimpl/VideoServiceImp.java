package com.xhyxt.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhyxt.mapper.VideoMapper;
import com.xhyxt.pojo.VideoUp;
import com.xhyxt.service.VideoService;

@Service
public class VideoServiceImp implements VideoService{
	
	@Autowired 
	private VideoMapper videoMapper;
	
	@Override
	public void addInfo(VideoUp videoUp) {
		videoUp.setCreated(new Date());
		videoUp.setUpdated(new Date());
		videoMapper.addInfo(videoUp);
	}

	@Override
	public List<VideoUp> queryFile(VideoUp videoUp) {
		return videoMapper.queryFile(videoUp);
	}

	@Override
	public void videoDelete(String[] ids) {
		videoMapper.videoDelete(ids);
	}

	@Override
	public VideoUp queryById(int id) {
		return videoMapper.queryById(id);
	}

}
