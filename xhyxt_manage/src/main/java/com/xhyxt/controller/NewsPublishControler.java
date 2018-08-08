package com.xhyxt.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xhyxt.pojo.NewsPublish;
import com.xhyxt.service.NewsService;

/**
 * 信息动态管理
 * @author Administrator
 *
 */
@Controller
public class NewsPublishControler {
	
	@Autowired
	private NewsService newsService;
	
	//新闻动态管理
	@RequestMapping("news_admin")
	public String News_admin(){ return "admin/news_admin";}
						
	//新闻动态添加
	@RequestMapping("news_admin_add")
	public String News_admin_add(){ return "admin/news_admin_add";}
	
	//后台添加
	@RequestMapping("/newsAdd")
	public String newsAdd(NewsPublish newsPublish,Model model,HttpServletResponse response){
		
		response.setContentType("text/html;charset=utf-8");
		if(StringUtils.isEmpty(newsPublish.getNewsTitle()) || StringUtils.isEmpty(newsPublish.getId())){
			model.addAttribute("errorInfo", "信息不能为空");
		}else{
			newsService.addInfo(newsPublish);
		}
		return "redirect:newsQuery";
	}
	//后台显示
	@RequestMapping("/newsQuery")
	public String newsQuery(NewsPublish newsPublish,Model model){
		
		List<NewsPublish> newsList =newsService.queryNews(newsPublish);
		model.addAttribute("newsList",newsList);
		return "admin/news_admin";
	}
	//前台显示
	@RequestMapping("/newsBeforeQuery")
	public String newsQuery2(NewsPublish newsPublish,Model model){
		
		List<NewsPublish> newsList =newsService.queryNews(newsPublish);
		model.addAttribute("newsList",newsList);
		return "before/news";
	}
	
	//前台动态详细内容展示
	@RequestMapping("/newsBeforeInfoQuery")
	public String newsQuery3(String id,Model model){
		
		NewsPublish newsInfoList =newsService.queryNewsInfo(id);
		model.addAttribute("newsInfoList",newsInfoList);
		return "before/news_info";
	}
	
	//修改编辑
	@RequestMapping("/toNewsUpdate")
	public String newsUpdate(String id,Model model){
		NewsPublish newsUpdate=newsService.findById(id);
		model.addAttribute("newsUpdate",newsUpdate);
		return "admin/news_admin_update";
	}
	//编辑
	@RequestMapping("/newsUpdate")
	public String updateNews(NewsPublish newsPublish){
		newsService.updateNews(newsPublish);
		return "redirect:newsQuery";
	}
		
	//删除
	@RequestMapping("/newsDelete")
	public String newsDelete(@RequestParam(value="id",required=false)String[] ids,Model model){
		if(ids!=null){
			newsService.newsDelete(ids);
		}
		return "redirect:newsQuery";
	}
}
