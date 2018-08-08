package com.xhyxt.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhyxt.mapper.NewsMapper;
import com.xhyxt.pojo.NewsPublish;
import com.xhyxt.service.NewsService;

@Service
public class NewsServiceImp implements NewsService{

	@Autowired
	private NewsMapper newsMapper;
	@Override
	public void addInfo(NewsPublish newsPublish) {
		newsPublish.setCreated(new Date());
		newsPublish.setUpdated(new Date());
		newsMapper.addInfo(newsPublish);
	}

	@Override
	public List<NewsPublish> queryNews(NewsPublish newsPublish) {
		return newsMapper.queryNews(newsPublish);
	}

	@Override
	public NewsPublish findById(String id) {
		return newsMapper.findById(id);
	}

	@Override
	public void updateNews(NewsPublish newsPublish) {
		newsPublish.setUpdated(new Date());
		newsMapper.updateNews(newsPublish);
	}

	@Override
	public void newsDelete(String[] ids) {
		newsMapper.newsDelete(ids);
	}

	@Override
	public NewsPublish queryNewsInfo(String id) {
		return newsMapper.queryNewsInfo(id);
	}


}
