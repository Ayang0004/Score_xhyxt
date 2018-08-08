package com.xhyxt.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xhyxt.pojo.Admin;
import com.xhyxt.pojo.Student;
import com.xhyxt.pojo.Teacher;
import com.xhyxt.service.AdminService;
import com.xhyxt.service.StudentService;
import com.xhyxt.service.TeacherService;



@Controller
public class LoginController {

	@Autowired
	private StudentService studentService;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private AdminService adminService;

	
	//转向登录注册页面
	@RequestMapping("login")
	public String Login(){ return "before/login";}
	
    
  //拦截并执行学生登录请求
    @RequestMapping("/tostuLogin")
    public String toLogin(String stuNum, String password, Model model, HttpSession session) {

        if (StringUtils.isEmpty(stuNum) || StringUtils.isEmpty(password)) {
            model.addAttribute("errorInfo", "学号或密码不能为空");
            return "before/login";
        }
        Student student = studentService.login(stuNum, password);
        if (student == null) {
            model.addAttribute("errorInfo", "学号或密码错误");
            return "before/login";
        }
        session.setAttribute("CURRENTBEFORE_USER", student);
        return "/index";
    }
    
  
	
	// 拦截并执行教师登录请求
	@RequestMapping("/toTeachLogin")
	public String toLogin2(String teachNum, String password, Model model, HttpSession session) {

		if (StringUtils.isEmpty(teachNum) || StringUtils.isEmpty(password)) {
			model.addAttribute("errorInfo", "工号或密码不能为空");
			return "before/login";
		}
		Teacher teacher = teacherService.login(teachNum, password);
		if (teacher == null) {
			model.addAttribute("errorInfo", "工号或密码错误");
			return "before/login";
		}
		session.setAttribute("CURRENTBEFORE_USER", teacher);
		return "index";
	}
	
	
	 //拦截并执行后台管理请求
    @RequestMapping("/toadminLogin")
    public String toadminLogin(String username, String password, Model model, HttpSession session) {

       if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            model.addAttribute("errorInfo", "账号或密码不能为空");
            return "admin/admin_login";
        }
        Admin admin = adminService.login(username, password);
        if (admin == null) {
            model.addAttribute("errorInfo", "账号或密码错误");
            return "admin/admin_login";
        }
        session.setAttribute("CURRENTADMIN_USER", admin);
        return "admin/admin_index";
    }
    
    //后台退出注销
 	@RequestMapping("/adminlogout")
 	public String toLogout(HttpSession session, HttpServletResponse response) {

 		// 销毁session
 		session.invalidate();
 		// 销毁cookie
 		Cookie ck = new Cookie("CURRENTADMIN_USER", null);
 		ck.setPath("/");
 		ck.setMaxAge(0);
 		response.addCookie(ck);
 		return "redirect:/admin_login";
 	}

}
