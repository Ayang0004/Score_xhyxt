package com.xhyxt.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xhyxt.pojo.TeachCondition;
import com.xhyxt.service.TeachConditionService;

/**
 * 教学条件管理
 * @author Administrator
 *
 */
@Controller
public class TeachConditionController {
	
	@Autowired
	private TeachConditionService teachConditionService;
	
	@RequestMapping("teach_Textbooks_admin")
	public String teach_Textbooks_admin(){ return "admin/teach_Textbooks_admin";}
	
	// 教材及教学内容添加
	@RequestMapping("teach_Textbooks_add")
	public String teach_Theory_add() {
		return "admin/teach_Textbooks_add";
	}

	// 后台添加
	@RequestMapping("/teachTextbooksAdd")
	public String teachTheoryadd(TeachCondition teachCondition, Model model, HttpServletResponse response) {

		response.setContentType("text/html;charset=utf-8");
		teachConditionService.addInfo(teachCondition);
			return "redirect:teachTextbooksQuery";
	}

	// 后台显示
	@RequestMapping("/teachTextbooksQuery")
	public String teachTextbooksQuery(TeachCondition teachCondition, Model model) {
		List<TeachCondition> teachTextbooksList = teachConditionService.queryteachTextbooks(teachCondition);
		model.addAttribute("teachTextbooksList", teachTextbooksList);
		return "admin/teach_Textbooks_admin";
	}

	// 前台动态详细内容展示
	@RequestMapping("/teachTextbooksBeforeInfoQuery")
	public String teachTextbooksBeforeInfoQuery(TeachCondition teachCondition, Model model) {

		TeachCondition TextbooksContInfo = teachConditionService.queryTextbooksInfo(teachCondition);
		model.addAttribute("TextbooksContInfo", TextbooksContInfo);
		return "before/teachTextbooks_info";
	}

	// 删除
	@RequestMapping("/teachTextooksDelete")
	public String teachTextooksDelete(@RequestParam(value = "id", required = false) String[] ids, Model model) {
		if (ids != null) {
			teachConditionService.teachTextooksDelete(ids);
		}
		return "redirect:teachTextbooksQuery";
	}
	
	/**
	 * 网络教学条件
	 */
	@RequestMapping("teach_Net_admin")
	public String teach_Net_admin(){ return "admin/teach_Net_admin";}
	
	// 教材及教学内容添加
	@RequestMapping("teach_Net_add")
	public String teach_Net_add() {
		return "admin/teach_Net_add";
	}

	// 后台添加
	@RequestMapping("/teachNetAdd")
	public String teachNetAdd(TeachCondition teachCondition, Model model, HttpServletResponse response) {

		response.setContentType("text/html;charset=utf-8");
		teachConditionService.addNetInfo(teachCondition);
			return "redirect:teachNetQuery";
	}

	// 后台显示
	@RequestMapping("/teachNetQuery")
	public String teachNetQuery(TeachCondition teachCondition, Model model) {
		List<TeachCondition> teachNetList = teachConditionService.queryteachNet(teachCondition);
		model.addAttribute("teachNetList", teachNetList);
		return "admin/teach_Net_admin";
	}

	// 前台动态详细内容展示
	@RequestMapping("/teachNetBeforeInfoQuery")
	public String teachNetBeforeInfoQuery(TeachCondition teachCondition, Model model) {

		TeachCondition NetContInfo = teachConditionService.queryNetInfo(teachCondition);
		model.addAttribute("NetContInfo", NetContInfo);
		return "before/teachNet_info";
	}

	// 删除
	@RequestMapping("/teachNetDelete")
	public String teachNetDelete(@RequestParam(value = "id", required = false) String[] ids, Model model) {
		if (ids != null) {
			teachConditionService.teachNetDelete(ids);
		}
		return "redirect:teachNetQuery";
	}
	
}
