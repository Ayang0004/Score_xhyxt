package com.xhyxt.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xhyxt.pojo.BannerPicUp;
import com.xhyxt.service.BannerService;
/**
 * 轮播图管理
 * @author Administrator
 */
@Controller
public class BannerController {
	
	@Autowired
	private BannerService bannerService;
	
	/*//轮播管理
	@RequestMapping("banner_admin")
	public String Banner_admin(){ return "admin/banner_admin";}*/
		
	//轮播图片添加
	@RequestMapping("banner_admin_add")
	public String Banner_admin_add(){ return "admin/banner_admin_add";}
	
	//后台添加
	@RequestMapping("/bannerPicAdd")
	public String bannerPicAdd(BannerPicUp bannerPicUp,Model model,HttpServletResponse response){
		
		response.setContentType("text/html;charset=utf-8");
		if(StringUtils.isEmpty(bannerPicUp.getPicTitle()) || StringUtils.isEmpty(bannerPicUp.getPicCategory()) || StringUtils.isEmpty(bannerPicUp.getPicUrl()) || StringUtils.isEmpty(bannerPicUp.getId())){
			model.addAttribute("errorInfo", "信息不能为空");
		}else{
			bannerService.addInfo(bannerPicUp);
		}
		return "redirect:bannerPicQuery";
	}
	
	//后台显示
	@RequestMapping("/bannerPicQuery")
	public String bannerPicQuery(BannerPicUp bannerPicUp,Model model){
		
		List<BannerPicUp> bannerList =bannerService.queryPic(bannerPicUp);
		model.addAttribute("bannerList",bannerList);
		return "admin/banner_admin";
	}
	
	//前台显示
	@RequestMapping("index")
	public String bannerPicQuery2(BannerPicUp bannerPicUp,Model model){
			
		List<BannerPicUp> bannerList =bannerService.queryPic(bannerPicUp);
		model.addAttribute("bannerList",bannerList);
		return "index";
	}
	
	//修改编辑
	@RequestMapping("/tobannerPicUpdate")
	public String bannerPicUpdate(String id,Model model){
		BannerPicUp bannerUpdate=bannerService.findById(id);
		model.addAttribute("bannerUpdate",bannerUpdate);
		return "admin/banner_admin_update";
	}
	//编辑
	@RequestMapping("/picUpdate")
	public String updatePic(BannerPicUp bannerPicUp){
		bannerService.updatePic(bannerPicUp);
		return "redirect:bannerPicQuery";
	}
	
	//删除
	@RequestMapping("/picDelete")
	public String delete(@RequestParam(value="id",required=false)String[] ids,Model model){
		if(ids!=null){
			bannerService.picDelete(ids);
		}
		return "redirect:bannerPicQuery";
	}
}
