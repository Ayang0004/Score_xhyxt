package com.xhyxt.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xhyxt.pojo.Admin;
import com.xhyxt.pojo.Student;
import com.xhyxt.pojo.Teacher;
import com.xhyxt.service.AdminService;
import com.xhyxt.service.StudentService;
import com.xhyxt.service.TeacherService;
/**
 * 后台用户管理
 * 学生 教师 管理员
 * @author Administrator
 *
 */
@Controller
public class UserNameController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private TeacherService teacherService;
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("student_admin")
	public String student_admin(){ return "admin/student_admin";}
	
	@RequestMapping("student_admin_add")
	public String student_admin_add(){ return "admin/student_admin_add";}
	
	
	/**
	 * 学生操作
	 * @param student
	 * @param model
	 * @param response
	 * @return
	 */
	//学生添加
	@RequestMapping("/studentAdd")
	public String studentAdd(Student student,Model model,HttpServletResponse response){
		
		response.setContentType("text/html;charset=utf-8");
		if(StringUtils.isEmpty(student.getStuNum()) || StringUtils.isEmpty(student.getRelname()) || StringUtils.isEmpty(student.getPassword()) || StringUtils.isEmpty(student.getPassword2())){
			model.addAttribute("errorInfo", "信息不能为空");
		}else{
			studentService.addUserName(student);
		}
		return "redirect:studentQuery";
	}
	//学生列表
	@RequestMapping("/studentQuery")
	public String studentQuery(Student student,Model model){
		
		List<Student> studentList =studentService.queryStudentList(student);
		model.addAttribute("studentList",studentList);
		return "admin/student_admin";
	}
	//修改编辑
	@RequestMapping("/toStudentUpdate")
	public String studentUpdate(String id,Model model){
		Student studentUpdate=studentService.findById(id);
		model.addAttribute("studentUpdate",studentUpdate);
		return "admin/student_admin_update";
	}
	//编辑
	@RequestMapping("/studentUpdate")
	public String updatePic(Student student){
		studentService.updateStudent(student);
		return "redirect:studentQuery";
	}
		
	//删除
	@RequestMapping("/studnetDelete")
	public String delete(@RequestParam(value="id",required=false)String[] ids,Model model){
		if(ids!=null){
			studentService.studentDelete(ids);
		}
		return "redirect:studentQuery";
	}
	
	

	@RequestMapping("teacher_admin")
	public String teacher_admin(){ return "admin/teacher_admin";}
	
	@RequestMapping("teacher_admin_add")
	public String teacher_admin_add(){ return "admin/teacher_admin_add";}
	
	/**
	 * 教师用户操作
	 * @param teacher
	 * @param model
	 * @param response
	 * @return
	 */
	//教师添加
	@RequestMapping("/teacherAdd")
	public String teahcerAdd(Teacher teacher,Model model,HttpServletResponse response){
		
		response.setContentType("text/html;charset=utf-8");
		if(StringUtils.isEmpty(teacher.getTeachNum()) || StringUtils.isEmpty(teacher.getRelname()) || StringUtils.isEmpty(teacher.getPassword()) || StringUtils.isEmpty(teacher.getEmail())){
			model.addAttribute("errorInfo", "信息不能为空");
		}else{
			teacherService.addTeacher(teacher);
		}
		return "redirect:teacherQuery";
	}
	
	//教师列表
	@RequestMapping("/teacherQuery")
	public String teacherQuery(Teacher teacher,Model model){
		
		List<Teacher> teacherList =teacherService.queryTeacherList(teacher);
		model.addAttribute("teacherList",teacherList);
		return "admin/teacher_admin";
	}
	
	//修改编辑
	@RequestMapping("/toTeacherUpdate")
	public String teacherUpdate(String id, Model model) {
		Teacher teacherUpdate = teacherService.findById(id);
		model.addAttribute("teacherUpdate", teacherUpdate);
		return "admin/teacher_admin_update";
	}

	// 编辑
	@RequestMapping("/teacherUpdate")
	public String updateTeacher(Teacher teacher) {
		teacherService.updateTeacher(teacher);
		return "redirect:teacherQuery";
	}

	// 删除
	@RequestMapping("/teacherDelete")
	public String deleteTeacher(@RequestParam(value = "id", required = false) String[] ids, Model model) {
		if (ids != null) {
			teacherService.teacherDelete(ids);
		}
		return "redirect:teacherQuery";
	}
	

	
	@RequestMapping("admins_admin")
	public String admins_admin(){ return "admin/admins_admin";}
	
	@RequestMapping("admins_admin_add")
	public String admins_admin_add(){ return "admin/admins_admin_add";}
	
	/**
	 * 管理员操作
	 * @param admin
	 * @param model
	 * @param response
	 * @return
	 */
	//管理员添加
	@RequestMapping("/adminAdd")
	public String adminsAdd(Admin admin,Model model,HttpServletResponse response){
		
		response.setContentType("text/html;charset=utf-8");
		if(StringUtils.isEmpty(admin.getUsername()) || StringUtils.isEmpty(admin.getRelname()) || StringUtils.isEmpty(admin.getPassword()) || StringUtils.isEmpty(admin.getPhone())){
			model.addAttribute("errorInfo", "信息不能为空");
		}else{
			adminService.addAdmin(admin);
		}
		return "redirect:adminQuery";
	}
	//管理员列表
	@RequestMapping("/adminQuery")
	public String adminsQuery(Admin admin,Model model){
		
		List<Admin> adminList =adminService.queryAdminList(admin);
		model.addAttribute("adminList",adminList);
		return "admin/admins_admin";
	}
	
	// 修改编辑
	@RequestMapping("/toAdminUpdate")
	public String adminUpdate(String id, Model model) {
		Admin adminUpdate = adminService.findById(id);
		model.addAttribute("adminUpdate", adminUpdate);
		return "admin/admins_admin_update";
	}

	// 编辑
	@RequestMapping("/adminUpdate")
	public String adminTeacher(Admin admin) {
		adminService.updateAdmin(admin);
		return "redirect:adminQuery";
	}

	// 删除
	@RequestMapping("/adminDelete")
	public String deleteAdmin(@RequestParam(value = "id", required = false) String[] ids, Model model) {
		if (ids != null) {
			adminService.adminDelete(ids);
		}
		return "redirect:adminQuery";
	}
}
