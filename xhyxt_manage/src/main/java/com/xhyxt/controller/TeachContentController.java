package com.xhyxt.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xhyxt.pojo.TeachContent;
import com.xhyxt.service.TeachContentService;

/**
 * 教学内容管理
 * @author Administrator
 *
 */
@Controller
public class TeachContentController {
	
	@Autowired
	private  TeachContentService teachContentService;
	
	@RequestMapping("teach_Theory_admin")
	public String teach_Theory_admin(){ return "admin/teach_Theory_admin";}
	
	// 理论教学添加
	@RequestMapping("teach_Theory_add")
	public String teach_Theory_add() {
		return "admin/teach_Theory_add";
	}

	// 后台添加
	@RequestMapping("/teachTheoryAdd")
	public String teachTheoryadd(TeachContent teachContent, Model model, HttpServletResponse response) {

		response.setContentType("text/html;charset=utf-8");
		teachContentService.addInfo(teachContent);
			return "redirect:teachTheoryQuery";
	}

	// 后台显示
	@RequestMapping("/teachTheoryQuery")
	public String teachTheoryQuery(TeachContent teachContent, Model model) {

		List<TeachContent> teachTheoryList = teachContentService.queryteachTheory(teachContent);
		model.addAttribute("teachTheoryList", teachTheoryList);
		return "admin/teach_Theory_admin";
	}

	// 前台动态详细内容展示
	@RequestMapping("/teachTheoryBeforeInfoQuery")
	public String teachTheoryBeforeInfoQuery(TeachContent teachContent, Model model) {

		TeachContent TheoryContInfo = teachContentService.queryTheoryInfo(teachContent);
		model.addAttribute("TheoryContInfo", TheoryContInfo);
		return "before/teachTheory_info";
	}

	// 删除
	@RequestMapping("/teachTheoryDelete")
	public String teachTheoryDelete(@RequestParam(value = "id", required = false) String[] ids, Model model) {
		if (ids != null) {
			teachContentService.teachTheoryDelete(ids);
		}
		return "redirect:teachTheoryQuery";
	}
	
	/**
	 * 实践教学
	 * @return
	 */
	@RequestMapping("teach_Parctice_admin")
	public String teach_Parctice_admin(){ return "admin/teach_Parctice_admin";}
	
	// 实践教学添加
	@RequestMapping("teach_Parctice_add")
	public String teach_Parctice_add() {
		return "admin/teach_Parctice_add";
	}

	// 后台添加
	@RequestMapping("/teachParcticeAdd")
	public String teachParcticeAdd(TeachContent teachContent, Model model, HttpServletResponse response) {

		response.setContentType("text/html;charset=utf-8");
		teachContentService.addParcticeInfo(teachContent);
		return "redirect:teachParcticeQuery";
	}

	// 后台显示
	@RequestMapping("/teachParcticeQuery")
	public String teachParcticeQuery(TeachContent teachContent, Model model) {

		List<TeachContent> teachParcticeList = teachContentService.queryTeachParctice(teachContent);
		model.addAttribute("teachParcticeList", teachParcticeList);
		return "admin/teach_Parctice_admin";
	}

	// 前台动态详细内容展示
	@RequestMapping("/teachParcticeBeforeInfoQuery")
	public String teachParcticeBeforeInfoQuery(TeachContent teachContent, Model model) {

		TeachContent teachParcticeContInfo = teachContentService.queryParcticeInfo(teachContent);
		model.addAttribute("teachParcticeContInfo", teachParcticeContInfo);
		return "before/teachParctice_info";
	}

	// 删除
	@RequestMapping("/teachParcticeDelete")
	public String teachParcticeDelete(@RequestParam(value = "id", required = false) String[] ids, Model model) {
		if (ids != null) {
			teachContentService.teachParcticeDelete(ids);
		}
		return "redirect:teachParcticeQuery";
	}
	/**
	 * 教学组织安排
	 * @return
	 */
	@RequestMapping("teach_Org_admin")
	public String teach_Org_admin(){ return "admin/teach_Org_admin";}
	
	// 教学组织结构添加
	@RequestMapping("teach_Org_add")
	public String teach_Org_add() {
		return "admin/teach_Org_add";
	}

	// 后台添加
	@RequestMapping("/teachOrgAdd")
	public String teachOrgAdd(TeachContent teachContent, Model model, HttpServletResponse response) {

		response.setContentType("text/html;charset=utf-8");
		teachContentService.addOrgInfo(teachContent);
		return "redirect:teachOrgQuery";
	}

	// 后台显示
	@RequestMapping("/teachOrgQuery")
	public String teachOrgQuery(TeachContent teachContent, Model model) {

		List<TeachContent> teachOrgList = teachContentService.queryTeachOrg(teachContent);
		model.addAttribute("teachOrgList", teachOrgList);
		return "admin/teach_Org_admin";
	}

	// 前台动态详细内容展示
	@RequestMapping("/teachOrgBeforeInfoQuery")
	public String teachOrgBeforeInfoQuery(TeachContent teachContent, Model model) {

		TeachContent teachOrgContInfo = teachContentService.queryOrgInfo(teachContent);
		model.addAttribute("teachOrgContInfo", teachOrgContInfo);
		return "before/teachOrg_info";
	}

	// 删除
	@RequestMapping("/teachOrgDelete")
	public String teachOrgDelete(@RequestParam(value = "id", required = false) String[] ids, Model model) {
		if (ids != null) {
			teachContentService.teachOrgDelete(ids);
		}
		return "redirect:teachOrgQuery";
	}
	
	
}
