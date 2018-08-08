package com.xhyxt.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xhyxt.pojo.TeachEffect;
import com.xhyxt.service.TeachEffectService;

/**
 * 教学效果管理
 * @author Administrator
 *
 */
@Controller
public class TeachEffectController {
	@Autowired
	private  TeachEffectService teachEffectService;
	
	@RequestMapping("teach_Effect_admin")
	public String teach_Effect_admin(){ return "admin/teach_Effect_admin";}
	
	// 教学效果信息添加
	@RequestMapping("teach_Effect_add")
	public String teach_Effect_add() {
		return "admin/teach_Effect_add";
	}

	// 后台添加
	@RequestMapping("/teachEffectAdd")
	public String teachEffectAdd(TeachEffect teachEffect, Model model, HttpServletResponse response) {

		response.setContentType("text/html;charset=utf-8");
		teachEffectService.addInfo(teachEffect);
			return "redirect:teachEffectQuery";
	}

	// 后台显示
	@RequestMapping("/teachEffectQuery")
	public String teachEffectQuery(TeachEffect teachEffect, Model model) {

		List<TeachEffect> teachEffectList = teachEffectService.queryteachEffect(teachEffect);
		model.addAttribute("teachEffectList", teachEffectList);
		return "admin/teach_Effect_admin";
	}

	// 前台动态详细内容展示
	@RequestMapping("/teachEffectBeforeInfoQuery")
	public String teachEffectBeforeInfoQuery(TeachEffect teachEffect, Model model) {

		TeachEffect EffectContInfo = teachEffectService.queryEffectInfo(teachEffect);
		model.addAttribute("EffectContInfo", EffectContInfo);
		return "before/teachEffect_info";
	}

	// 删除
	@RequestMapping("/teachEffectDelete")
	public String teachEffectDelete(@RequestParam(value = "id", required = false) String[] ids, Model model) {
		if (ids != null) {
			teachEffectService.teachEffectDelete(ids);
		}
		return "redirect:teachEffectQuery";
	}
}
