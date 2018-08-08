package com.xhyxt.service;

import java.util.List;

import com.xhyxt.pojo.NewsPublish;

public interface NewsService {

	void addInfo(NewsPublish newsPublish);

	List<NewsPublish> queryNews(NewsPublish newsPublish);

	NewsPublish findById(String id);

	void updateNews(NewsPublish newsPublish);

	void newsDelete(String[] ids);

	NewsPublish queryNewsInfo(String id);


}
