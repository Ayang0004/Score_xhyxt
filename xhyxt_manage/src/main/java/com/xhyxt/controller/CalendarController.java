package com.xhyxt.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xhyxt.pojo.Calendar;
import com.xhyxt.service.CalendarService;
/**
 * 周历管理
 * @author Administrator
 *
 */
@Controller
public class CalendarController {

	@Autowired
	private CalendarService calendarService;
	//周历管理
	@RequestMapping("calendar_admin")
	public String Calendar_admin(){ return "admin/calendar_admin";}
	
	@RequestMapping("calendar_admin_add")
	public String Calendar_admin_add(){ return "admin/calendar_admin_add";}
	
	//后台添加
	@RequestMapping("/calendarAdd")
	public String calendarAdd(Calendar calendar,Model model,HttpServletResponse response){
		
		response.setContentType("text/html;charset=utf-8");
		if(StringUtils.isEmpty(calendar.getCalTitle()) || StringUtils.isEmpty(calendar.getCalCategory()) || StringUtils.isEmpty(calendar.getCalCont()) || StringUtils.isEmpty(calendar.getId())){
			model.addAttribute("errorInfo", "信息不能为空");
		}else{
			calendarService.addInfo(calendar);
		}
		return "redirect:calendarQuery";
	}
	//后台显示
	@RequestMapping("/calendarQuery")
	public String calendarQuery(Calendar calendar,Model model){
		
		List<Calendar> calendarList =calendarService.queryFile(calendar);
		model.addAttribute("calendarList",calendarList);
		return "admin/calendar_admin";
	}
	//前台显示
	@RequestMapping("/calendarBeforeQuery")
	public String calendarQuery2(Calendar calendar,Model model){
		
		List<Calendar> calendarList =calendarService.queryFile(calendar);
		model.addAttribute("calendarList",calendarList);
		return "before/calendar";
	}
	//修改编辑
	@RequestMapping("/tocalendarUpdate")
	public String bannerPicUpdate(String id,Model model){
		Calendar calendarUpdate=calendarService.findById(id);
		model.addAttribute("calendarUpdate",calendarUpdate);
			return "admin/calendar_admin_update";
		}
	//编辑
	@RequestMapping("/calendarUpdate")
	public String updatePic(Calendar calendar){
		calendarService.updateFile(calendar);
		return "redirect:calendarQuery";
		}
	
	//删除
	@RequestMapping("/calendarDelete")
	public String delete(@RequestParam(value="id",required=false)String[] ids,Model model){
		if(ids!=null){
			calendarService.calendarDelete(ids);
		}
		return "redirect:calendarQuery";
	}
}
