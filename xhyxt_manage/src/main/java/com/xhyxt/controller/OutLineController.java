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
import com.xhyxt.pojo.FileUploads;
import com.xhyxt.service.OutLineService;

/**
 * 大纲管理
 * @author Administrator
 *
 */
@Controller
public class OutLineController {

	@Autowired
	private OutLineService outLineService;
	
	//大纲管理
	@RequestMapping("outline_admin")
	public String Outline_admin(){ return "admin/outline_admin";}
		
	//大纲修改
	@RequestMapping("outline_admin_update")
	public String Outline_admin_update(){ return "admin/outline_admin_update";}
	
	
	@RequestMapping("/outLineFileAdd")
	public String bannerPicAdd(FileUploads fileUploads,Model model,HttpServletResponse response){
		
		response.setContentType("text/html;charset=utf-8");
		if(StringUtils.isEmpty(fileUploads.getFileTitle()) || StringUtils.isEmpty(fileUploads.getFileCategory()) || StringUtils.isEmpty(fileUploads.getPicUrl()) || StringUtils.isEmpty(fileUploads.getId())){
			model.addAttribute("errorInfo", "信息不能为空");
		}else{
			outLineService.addInfo(fileUploads);
		}
		return "redirect:outLineFileQuery";
	}
	
	//后台显示
	@RequestMapping("/outLineFileQuery")
	public String bannerPicQuery(FileUploads fileUploads,Model model){
		
		List<FileUploads> outlineList =outLineService.queryFile(fileUploads);
		model.addAttribute("outlineList",outlineList);
		return "admin/outline_admin";
	}
	
	//前台显示
	@RequestMapping("/outLineBeforeFileQuery")
	public String bannerPicQuery2(FileUploads fileUploads,Model model){
		
		List<FileUploads> outlineList =outLineService.queryFile(fileUploads);
		model.addAttribute("outlineList",outlineList);
		return "before/outline";
	}
	
	//删除
	@RequestMapping("/outlineDelete")
	public String delete(@RequestParam(value="id",required=false)String[] ids,Model model){
		if(ids!=null){
			outLineService.outlineDelete(ids);
		}
			return "redirect:outLineFileQuery";
	}
	
}
