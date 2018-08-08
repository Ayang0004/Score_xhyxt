package com.xhyxt.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xhyxt.exception.MyException;
import com.xhyxt.pojo.Student;
import com.xhyxt.pojo.Teacher;
import com.xhyxt.service.StudentService;
import com.xhyxt.service.TeacherService;
import com.xhyxt.tools.VerifyCode;

@Controller
public class RegistController {

	@Autowired
	private StudentService studentService;
	@Autowired
	private TeacherService teacherService;

	@RequestMapping("regist")
	public String toRegist() {
		return "before/regist";
	}

	// 注册
	@RequestMapping("/toCheckStuNum")
	public void toCheckStuNum1(String stuNum,String teachNum, HttpServletResponse response) throws IOException {
		boolean result = studentService.checkstuNum(stuNum) && teacherService.checkTeachNum(teachNum);

		response.setContentType("text/html;charset=utf-8");
		if (result) {
			response.getWriter().write("<font style='color:red'>学号已存在!</font>");
		} else if (!result) {
			response.getWriter().write("<font style='color:green'>可以使用!</font>");
		}
	}

	@RequestMapping("/toCheckEmail")
	public void toCheckEmail1(String email, HttpServletResponse response) throws IOException {
		boolean result = studentService.checkEmail(email) && teacherService.checkEmail(email);
		System.out.println(email);
		response.setContentType("text/html;charset=utf-8");
		if (result) {
			response.getWriter().write("<font style='color:red'>邮箱已存在!</font>");
		} else if (!result) {
			response.getWriter().write("<font style='color:green'>可以使用!</font>");
		}
	}

	// 执行注册请求
	@RequestMapping("/toregist")
	public String toRegist(Model model, HttpServletRequest request, HttpSession session) {

		boolean b = false;
		Student student = new Student();
		Teacher teacher = new Teacher();

		try {
			BeanUtils.populate(student, request.getParameterMap());
			BeanUtils.populate(teacher, request.getParameterMap());
			
			if(student.getStuNum()==null || teacher.getTeachNum()!=null){
				teacher.check();
			}else{
				student.check();
			}

			// 判断验证码是否 正确
			Object obj = request.getSession().getAttribute("code");
			if (obj == null || !student.getValistr().equalsIgnoreCase((String) obj)) {
				request.setAttribute("vali_msg", "验证码输入错误");
				return "before/login";
			}
			if (obj == null || !teacher.getValistr().equalsIgnoreCase((String) obj)) {
				request.setAttribute("vali_msg", "验证码输入错误");
				return "before/login";
			}
			if(student.getStuNum() ==null || teacher.getTeachNum()!=null){
				b = teacherService.regist(teacher);
			}else{
				b = studentService.regist(student);
			}

		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (MyException e) {
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			return "before/login";
		}
		if (b) {
			return "/index";
		} else {
			model.addAttribute("msg", "注册失败！");
			return "redirect:before/login";
		}
	}

	/*//教师注册
	@RequestMapping("/toCheckTeachNum")
	public void toCheckStuNum(String teachNum, HttpServletResponse response) throws IOException {
		boolean result = teacherService.checkTeachNum(teachNum);
		response.setContentType("text/html;charset=utf-8");
		if (result) {
			response.getWriter().write("<font style='color:red'>工号已存在!</font>");
		} else if (!result) {
			response.getWriter().write("<font style='color:green'>可以使用!</font>");
		}
	}

	@RequestMapping("/toCheckEmail")
	public void toCheckEmail(String email, HttpServletResponse response) throws IOException {
		boolean result = teacherService.checkEmail(email);
		System.out.println(email);
		response.setContentType("text/html;charset=utf-8");
		if (result) {
			response.getWriter().write("<font style='color:red'>邮箱已存在!</font>");
		} else if (!result) {
			response.getWriter().write("<font style='color:green'>可以使用!</font>");
		}
	}

	// 执行注册请求

	@RequestMapping("/toregist")
	public String toRegist2(Model model, HttpServletRequest request, HttpSession session) {

		boolean b = false;
		Teacher teacher = new Teacher();

		try {
			BeanUtils.populate(teacher, request.getParameterMap());
			teacher.check();

			// 判断验证码是否 正确
			Object obj = request.getSession().getAttribute("code");
			if (obj == null || !teacher.getValistr().equalsIgnoreCase((String) obj)) {
				request.setAttribute("vali_msg", "验证码输入错误");
				return "before/regist";
			}
			b = teacherService.regist(teacher);

		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (MyException e) {
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			return "before/login";
		}
		if (b) {
			return "/index";
		} else {
			model.addAttribute("msg", "注册失败！");
			return "redirect:/login";
		}
	}*/

	// 向浏览器发送验证码图片
	@RequestMapping("toValistr")
	public void toValistr(HttpServletRequest request, HttpServletResponse response) throws IOException {
		/* 控制浏览器不要缓存验正码图片 */
		response.setDateHeader("Expires", -1);
		response.setHeader("Cache-Control", "no-cache");
		/* 绘制一张图片发送给浏览器 */
		VerifyCode vc = new VerifyCode();
		vc.drawImage(response.getOutputStream());
		// 获取验证码文本
		String valistr = vc.getCode();
		// 将验证码字符串保存到session中,以便在注册的
		// servlet中验证使用。
		System.out.println("code=" + valistr);
		request.getSession().setAttribute("code", valistr);
	}

	// 注销
	@RequestMapping("/logout")
	public String toLogout(HttpSession session, HttpServletResponse response) {

		// 销毁session
		session.invalidate();
		// 销毁cookie
		Cookie ck = new Cookie("CURRENT_USER", null);
		ck.setPath("/");
		ck.setMaxAge(0);
		response.addCookie(ck);
		return "redirect:/index";
	}
}
