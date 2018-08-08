package com.xhyxt.service;

import java.util.List;

import com.xhyxt.pojo.VideoUp;

public interface VideoService {

	void addInfo(VideoUp videoUp);

	List<VideoUp> queryFile(VideoUp videoUp);

	void videoDelete(String[] ids);

	VideoUp queryById(int id);

}
