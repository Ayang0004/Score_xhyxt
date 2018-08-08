package com.xhyxt.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xhyxt.pojo.CourseIntrod;
import com.xhyxt.service.CourseIntrodService;

/**
 * 课程介绍管理
 * @author Administrator
 *
 */
@Controller
public class CourseIntrodController {

	@Autowired
	private  CourseIntrodService courseIntrodService;
	
	@RequestMapping("course_Intord_admin")
	public String course_Introd_admin(){ return "admin/course_Intord_admin";}
	
	// 课程介绍添加
	@RequestMapping("course_Introd_add")
	public String course_introd_add() {
		return "admin/course_Introd_add";
	}

	// 后台添加
	@RequestMapping("/courseIntrodAdd")
	public String courseAdd(CourseIntrod courseIntrod, Model model, HttpServletResponse response) {

		response.setContentType("text/html;charset=utf-8");
		courseIntrodService.addInfo(courseIntrod);
			return "redirect:courseIntrodQuery";
	}

	// 后台显示
	@RequestMapping("/courseIntrodQuery")
	public String courseIntrodQuery(CourseIntrod courseIntrod, Model model) {

		List<CourseIntrod> courseIntrodList = courseIntrodService.queryCourseIntrod(courseIntrod);
		model.addAttribute("courseIntrodList", courseIntrodList);
		return "admin/course_Intord_admin";
	}

	// 前台动态详细内容展示
	@RequestMapping("/CourseIntrodBeforeInfoQuery")
	public String CourseIntrodBeforeInfoQuery(CourseIntrod courseIntrod, Model model) {

		CourseIntrod IntrodContInfoList = courseIntrodService.queryIntrodInfo(courseIntrod);
		System.out.println(courseIntrod.getId());
		System.out.println(IntrodContInfoList.getIntrodCont());
		model.addAttribute("IntrodContInfoList", IntrodContInfoList);
		return "before/courseIntrod_info";
	}

	// 删除
	@RequestMapping("/courseIntrodDelete")
	public String newsDelete(@RequestParam(value = "id", required = false) String[] ids, Model model) {
		if (ids != null) {
			courseIntrodService.CourseIntrodDelete(ids);
		}
		return "redirect:courseIntrodQuery";
	}
	
	/**
	 * 课程特色管理
	 * @return
	 */
	@RequestMapping("course_Features_admin")
	public String course_features_admin(){ return "admin/course_Features_admin";}
	
	// 课程介绍添加
	@RequestMapping("course_Features_add")
	public String course_features_add() {
		return "admin/course_Features_add";
	}

	// 后台添加
	@RequestMapping("/courseFeaturesAdd")
	public String courseFeaturesAdd(CourseIntrod courseIntrod, Model model, HttpServletResponse response) {

		response.setContentType("text/html;charset=utf-8");
		courseIntrodService.addFeaturesInfo(courseIntrod);
		return "redirect:courseFeaturesQuery";
	}

	// 后台显示
	@RequestMapping("/courseFeaturesQuery")
	public String courseFeaturesQuery(CourseIntrod courseIntrod, Model model) {

		List<CourseIntrod> courseFeaturesList = courseIntrodService.queryCourseFeatures(courseIntrod);
		model.addAttribute("courseFeaturesList", courseFeaturesList);
		return "admin/course_Features_admin";
	}

	// 前台动态详细内容展示
	@RequestMapping("/CourseFeaturesBeforeInfoQuery")
	public String CourseFeaturesBeforeInfoQuery(CourseIntrod courseIntrod, Model model) {

		CourseIntrod FeaturesContInfoList = courseIntrodService.queryFeaturesInfo(courseIntrod);
		model.addAttribute("FeaturesContInfoList", FeaturesContInfoList);
		return "before/courseFeatures_info";
	}

	// 删除
	@RequestMapping("/courseFeaturesDelete")
	public String FeaturesDelete(@RequestParam(value = "id", required = false) String[] ids, Model model) {
		if (ids != null) {
			courseIntrodService.CourseFeaturesDelete(ids);
		}
		return "redirect:courseFeaturesQuery";
	}
	/**
	 * 课程历史沿革
	 * @return
	 */
	@RequestMapping("course_History_admin")
	public String course_History_admin(){ return "admin/course_History_admin";}
	
	// 课程介绍添加
	@RequestMapping("course_History_add")
	public String course_History_add() {
		return "admin/course_History_add";
	}

	// 后台添加
	@RequestMapping("/courseHistoryAdd")
	public String courseHistoryAdd(CourseIntrod courseIntrod, Model model, HttpServletResponse response) {

		response.setContentType("text/html;charset=utf-8");
		courseIntrodService.addHistoryInfo(courseIntrod);
		return "redirect:courseHistoryQuery";
	}

	// 后台显示
	@RequestMapping("/courseHistoryQuery")
	public String courseHistoryQuery(CourseIntrod courseIntrod, Model model) {

		List<CourseIntrod> courseHistoryList = courseIntrodService.queryCourseHistory(courseIntrod);
		model.addAttribute("courseHistoryList", courseHistoryList);
		return "admin/course_History_admin";
	}

	// 前台动态详细内容展示
	@RequestMapping("/CourseHistoryBeforeInfoQuery")
	public String CourseHistoryBeforeInfoQuery(CourseIntrod courseIntrod, Model model) {

		CourseIntrod HistoryContInfoList = courseIntrodService.queryHistoryInfo(courseIntrod);
		model.addAttribute("HistoryContInfoList", HistoryContInfoList);
		return "before/courseHistory_info";
	}

	// 删除
	@RequestMapping("/courseHistoryDelete")
	public String HistoryDelete(@RequestParam(value = "id", required = false) String[] ids, Model model) {
		if (ids != null) {
			courseIntrodService.CourseHistoryDelete(ids);
		}
		return "redirect:courseHistoryQuery";
	}
}
