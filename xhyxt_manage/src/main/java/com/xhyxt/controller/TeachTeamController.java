package com.xhyxt.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xhyxt.pojo.TeachTeam;
import com.xhyxt.service.TeachTeamService;

/**
 * 教学队伍管理
 * @author Administrator
 *
 */
@Controller
public class TeachTeamController {

	@Autowired
	private  TeachTeamService teachTeamService;
	
	@RequestMapping("course_Leader_admin")
	public String teach_Leader_admin(){ return "admin/course_Leader_admin";}
	
	// 课程负责人添加
	@RequestMapping("course_Leader_add")
	public String teach_Leader_add() {
		return "admin/course_Leader_add";
	}

	// 后台添加
	@RequestMapping("/courseLeaderAdd")
	public String courseAdd(TeachTeam teachTeam, Model model, HttpServletResponse response) {

		response.setContentType("text/html;charset=utf-8");
		teachTeamService.addInfo(teachTeam);
			return "redirect:courseLeaderQuery";
	}

	// 后台显示
	@RequestMapping("/courseLeaderQuery")
	public String teachTeamQuery(TeachTeam teachTeam, Model model) {

		List<TeachTeam> teachLeaderList = teachTeamService.queryteachLeader(teachTeam);
		model.addAttribute("teachLeaderList", teachLeaderList);
		return "admin/course_Leader_admin";
	}

	// 前台动态详细内容展示
	@RequestMapping("/TeachLeaderBeforeInfoQuery")
	public String TeachLeaderBeforeInfoQuery(TeachTeam teachTeam, Model model) {

		TeachTeam LeaderContInfo = teachTeamService.queryLeaderInfo(teachTeam);
		model.addAttribute("LeaderContInfo", LeaderContInfo);
		return "before/teachLeader_info";
	}

	// 删除
	@RequestMapping("/teachLeaderDelete")
	public String teachLeaderDelete(@RequestParam(value = "id", required = false) String[] ids, Model model) {
		if (ids != null) {
			teachTeamService.teachLeaderDelete(ids);
		}
		return "redirect:courseLeaderQuery";
	}
	
	/**
	 * 课程特主讲教师
	 * @return
	 */
	@RequestMapping("course_Teachers_admin")
	public String course_Teachers_admin(){ return "admin/course_Teachers_admin";}
	
	// 课程特主讲教师添加
	@RequestMapping("course_Teachers_add")
	public String course_Teachers_add() {
		return "admin/course_Teachers_add";
	}

	// 后台添加
	@RequestMapping("/courseTeachersAdd")
	public String courseTeachersAdd(TeachTeam teachTeam, Model model, HttpServletResponse response) {

		response.setContentType("text/html;charset=utf-8");
		teachTeamService.addTeachersInfo(teachTeam);
		return "redirect:courseTeachersQuery";
	}

	// 后台显示
	@RequestMapping("/courseTeachersQuery")
	public String courseTeachersQuery(TeachTeam teachTeam, Model model) {

		List<TeachTeam> courseTeachersList = teachTeamService.queryCourseTeachers(teachTeam);
		model.addAttribute("courseTeachersList", courseTeachersList);
		return "admin/course_Teachers_admin";
	}

	// 前台动态详细内容展示
	@RequestMapping("/CourseTeachersBeforeInfoQuery")
	public String CourseFeaturesBeforeInfoQuery(TeachTeam teachTeam, Model model) {

		TeachTeam TeachersContInfo = teachTeamService.queryTeachersInfo(teachTeam);
		model.addAttribute("TeachersContInfo", TeachersContInfo);
		return "before/courseTeachers_info";
	}

	// 删除
	@RequestMapping("/courseTeachersDelete")
	public String TeachersDelete(@RequestParam(value = "id", required = false) String[] ids, Model model) {
		if (ids != null) {
			teachTeamService.CourseTeachersDelete(ids);
		}
		return "redirect:courseTeachersQuery";
	}
	/**
	 * 教学队伍结构
	 * @return
	 */
	@RequestMapping("course_Team_admin")
	public String course_Team_admin(){ return "admin/course_Team_admin";}
	
	// 教学队伍结构添加
	@RequestMapping("course_Team_add")
	public String course_Team_add() {
		return "admin/course_Team_add";
	}

	// 后台添加
	@RequestMapping("/courseTeamAdd")
	public String courseHistoryAdd(TeachTeam teachTeam, Model model, HttpServletResponse response) {

		response.setContentType("text/html;charset=utf-8");
		teachTeamService.addTeamInfo(teachTeam);
		return "redirect:courseTeamQuery";
	}

	// 后台显示
	@RequestMapping("/courseTeamQuery")
	public String courseTeamQuery(TeachTeam teachTeam, Model model) {

		List<TeachTeam> courseTeamList = teachTeamService.queryCourseTeam(teachTeam);
		model.addAttribute("courseTeamList", courseTeamList);
		return "admin/course_Team_admin";
	}

	// 前台动态详细内容展示
	@RequestMapping("/CourseTeamBeforeInfoQuery")
	public String CourseHistoryBeforeInfoQuery(TeachTeam teachTeam, Model model) {

		TeachTeam TeamContInfo = teachTeamService.queryTeamInfo(teachTeam);
		model.addAttribute("TeamContInfo", TeamContInfo);
		return "before/courseTeam_info";
	}

	// 删除
	@RequestMapping("/courseTeamDelete")
	public String courseTeamDelete(@RequestParam(value = "id", required = false) String[] ids, Model model) {
		if (ids != null) {
			teachTeamService.CourseTeamDelete(ids);
		}
		return "redirect:courseTeamQuery";
	}
}
