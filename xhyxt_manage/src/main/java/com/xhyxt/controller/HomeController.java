package com.xhyxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	/* --------前台界面---------  */
	//首页
	/*@RequestMapping("index")
	public String Home(){ return "index";}*/
	
	//课程简介
	@RequestMapping("introduce")
	public String Introduce(){ return "before/introduce";}
	
	//教学队伍
	@RequestMapping("teachteam")
	public String Teachteam(){ return "before/teachteam";}
	
	//教学内荣
	@RequestMapping("teachcontent")
	public String Teachcontent(){ return "before/teachcontent";}
	
	//教学内荣
	@RequestMapping("teachcondition")
	public String Teachcondition(){ return "before/teachcondition";}
	
	
	
	//教学大纲
	@RequestMapping("outline")
	public String Outline(){ return "before/outline";}
	
	//教学周历
	@RequestMapping("calendar")
	public String Calendar(){ return "before/calendar";}
	
	//电子教案
	@RequestMapping("teachplay")
	public String Teachplay(){ return "before/teachplay";}
	
	//电子课件
	@RequestMapping("courseware")
	public String Courseware(){ return "before/courseware";}
	
	//新闻动态
	@RequestMapping("news")
	public String News(){ return "before/news";}
	
	//新闻动态详情
	@RequestMapping("news_info")
	public String News_info(){ return "before/news_info";}
	
	//教学视频
	@RequestMapping("video")
	public String Video(){ return "before/video";}
	
	//教学视频展示
	@RequestMapping("video_info")
	public String Video_info(){ return "before/video_info";}
	
	//互动平台
	@RequestMapping("communicationList")
	public String CommunicationList(){ return "before/communicationList";}
	
	//互动平台交流/评论
	@RequestMapping("communication")
	public String Communication(){ return "before/communication";}
	
	
	
	/* --------后台界面---------  */
	
	//后台登录
	@RequestMapping("admin_login")
	public String admin_Login(){ return "admin/admin_login";}
	
	//后台系统管理
	@RequestMapping("admin_index")
	public String Admin_index(){ return "admin/admin_login";}
	
	//桌面
	@RequestMapping("welcome")
	public String Welcome(){ return "admin/welcome";}
	
	//首页管理
	//logo管理
	@RequestMapping("logo_list")
	public String Logo_list(){ return "admin/logo_list";}
	
	//logo管理
	@RequestMapping("logo_list_add")
	public String Logo_list_add(){ return "admin/logo_list_add";}
	
	//导航管理
	@RequestMapping("nav_admin")
	public String Nav_admin(){ return "admin/nav_admin";}
	
	//导航管理添加
	@RequestMapping("nav_admin_add")
	public String Nav_admin_add(){ return "admin/nav_admin_add";}
	
	
	//内容管理
	@RequestMapping("context_admin")
	public String Context_admin(){ return "admin/context_admin";}
		
	//内容添加
	@RequestMapping("context_admin_add")
	public String Context_admin_add(){ return "admin/context_admin_add";}
	
	//系统统计折线图
	@RequestMapping("charts_1")
	public String Charts_1(){return "admin/charts_1";}
	
	//系统统计柱状图
	@RequestMapping("charts_2")
	public String Charts_2(){return "admin/charts_2";}
	
	//系统统计饼状图
	@RequestMapping("charts_3")
	public String Charts_3(){return "admin/charts_3";}
	
	
}
