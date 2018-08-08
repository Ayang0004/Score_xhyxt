package com.xhyxt.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xhyxt.pojo.CoursewareUp;
import com.xhyxt.pojo.TeahplayUp;
import com.xhyxt.service.CoursewareService;
/**
 * 电子课件管理
 * @author Administrator
 *
 */
@Controller
public class CoursewareUpController {

	@Autowired
	private CoursewareService coursewareService;
	//电子课件管理
	@RequestMapping("courseware_admin")
	public String Courseware_admin(){ return "admin/courseware_admin";}
			
	//电子课件添加
	@RequestMapping("courseware_admin_add")
	public String Courseware_admin_add(){ return "admin/courseware_admin_add";}
	
	//后台添加
	@RequestMapping("/coursewareFileAdd")
	public String coursewareAdd(CoursewareUp coursewareUp,Model model,HttpServletResponse response){
		
		response.setContentType("text/html;charset=utf-8");
		if(StringUtils.isEmpty(coursewareUp.getFileTitle()) || StringUtils.isEmpty(coursewareUp.getFileCategory()) || StringUtils.isEmpty(coursewareUp.getPicUrl()) || StringUtils.isEmpty(coursewareUp.getId())){
			model.addAttribute("errorInfo", "信息不能为空");
		}else{
			coursewareService.addInfo(coursewareUp);
		}
		return "redirect:coursewareFileQuery";
	}
	//后台显示
	@RequestMapping("/coursewareFileQuery")
	public String coursewareQuery(CoursewareUp coursewareUp,Model model){
		
		List<CoursewareUp> coursewareList =coursewareService.queryFile(coursewareUp);
		model.addAttribute("coursewareList",coursewareList);
		return "admin/courseware_admin";
	}
	
	//前台显示
	@RequestMapping("/coursewareBeforeQuery")
	public String coursewareQuery2(CoursewareUp coursewareUp,Model model){
		
		List<CoursewareUp> coursewareList =coursewareService.queryFile(coursewareUp);
		model.addAttribute("coursewareList",coursewareList);
		return "before/courseware";
	}
	//删除
	@RequestMapping("/courseDelete")
	public String delete(@RequestParam(value="id",required=false)String[] ids,Model model){
		if(ids!=null){
			coursewareService.courseDelete(ids);
		}
			return "redirect:coursewareFileQuery";
	}
	
	@RequestMapping("/downloadCourse")
	public String download(@RequestParam(value="id") int id,HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		TeahplayUp teahplayUpFile = coursewareService.queryById(id);
		String fileName = teahplayUpFile.getFileName();
		response.setCharacterEncoding("utf-8");
		response.setContentType("multipart/form-data");
		response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(fileName, "UTF-8"));
		try {
			String path = teahplayUpFile.getPicUrl();
			InputStream inputStream = new FileInputStream(new File(path));

			OutputStream os = response.getOutputStream();
			byte[] b = new byte[2048];
			int length;
			while ((length = inputStream.read(b)) > 0) {
				os.write(b, 0, length);
			}
			// 这里主要关闭。
			os.close();
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 返回值要注意，要不然就出现下面这句错误！
		// java+getOutputStream() has already been called for this response
		return null;
	}
}
