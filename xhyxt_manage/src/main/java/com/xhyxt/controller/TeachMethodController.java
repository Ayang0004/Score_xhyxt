package com.xhyxt.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xhyxt.pojo.TeachMethod;
import com.xhyxt.service.TeachMethodService;

/**
 * 教学方法管理
 * @author Administrator
 *
 */
@Controller
public class TeachMethodController {
	
	@Autowired
	private  TeachMethodService teachMethodService;
	
	@RequestMapping("teach_Method_admin")
	public String teach_Method_admin(){ return "admin/teach_Method_admin";}
	
	// 教学方法信息添加
	@RequestMapping("teach_Method_add")
	public String teach_Method_add() {
		return "admin/teach_Method_add";
	}

	// 后台添加
	@RequestMapping("/teachMethodAdd")
	public String teachMethodtAdd(TeachMethod teachMethod, Model model, HttpServletResponse response) {

		response.setContentType("text/html;charset=utf-8");
		teachMethodService.addInfo(teachMethod);
			return "redirect:teachMethodQuery";
	}

	// 后台显示
	@RequestMapping("/teachMethodQuery")
	public String teachMethodQuery(TeachMethod teachMethod, Model model) {

		List<TeachMethod> teachMethodList = teachMethodService.queryteachEffect(teachMethod);
		model.addAttribute("teachMethodList", teachMethodList);
		return "admin/teach_Method_admin";
	}

	// 前台动态详细内容展示
	@RequestMapping("/teachMethodBeforeInfoQuery")
	public String teachMethodBeforeInfoQuery(TeachMethod teachMethod, Model model) {

		TeachMethod MethodContInfo = teachMethodService.queryMethodInfo(teachMethod);
		model.addAttribute("MethodContInfo", MethodContInfo);
		return "before/teachMethod_info";
	}

	// 删除
	@RequestMapping("/teachMethodDelete")
	public String teachMethodDelete(@RequestParam(value = "id", required = false) String[] ids, Model model) {
		if (ids != null) {
			teachMethodService.teachmethodDelete(ids);
		}
		return "redirect:teachMethodQuery";
	}
}
