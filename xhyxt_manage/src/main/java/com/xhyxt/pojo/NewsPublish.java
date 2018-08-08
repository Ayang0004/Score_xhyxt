package com.xhyxt.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_news")
public class NewsPublish {

	private int id;
	private String newsName;
	private String newsTitle;
	private String newsCategory;
	private String news;
	private String newsCont;
	private String status;
	private Date created;
	private Date updated;
	private NewsPublish newsPublish;
	public NewsPublish getNewsPublish() {
		return newsPublish;
	}
	public void setNewsPublish(NewsPublish newsPublish) {
		this.newsPublish = newsPublish;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNewsName() {
		return newsName;
	}
	public void setNewsName(String newsName) {
		this.newsName = newsName;
	}
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	public String getNewsCategory() {
		return newsCategory;
	}
	public void setNewsCategory(String newsCategory) {
		this.newsCategory = newsCategory;
	}
	public String getNews() {
		return news;
	}
	public void setNews(String news) {
		this.news = news;
	}
	public String getNewsCont() {
		return newsCont;
	}
	public void setNewsCont(String newsCont) {
		this.newsCont = newsCont;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
}
