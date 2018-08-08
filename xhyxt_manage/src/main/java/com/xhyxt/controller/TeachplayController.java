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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xhyxt.pojo.TeahplayUp;
import com.xhyxt.service.TeachplayService;

/**
 * 电子教案管理
 * @author Administrator
 *
 */
@Controller
public class TeachplayController {
	
	@Autowired
	private TeachplayService teachplayService;
	//电子教案管理
	@RequestMapping("teachplay_admin")
	public String Teachplay_admin(){ return "admin/teachplay_admin";}
		
	//电子教案添加
	@RequestMapping("teachplay_admin_add")
	public String Teachplay_admin_add(){ return "admin/teachplay_admin_add";}
	
	//后台添加
	@RequestMapping("/teachplayFileAdd")
	public String bannerPicAdd(TeahplayUp teahplayUp,Model model,HttpServletResponse response){
		
		response.setContentType("text/html;charset=utf-8");
		if(StringUtils.isEmpty(teahplayUp.getFileTitle()) || StringUtils.isEmpty(teahplayUp.getFileCategory()) || StringUtils.isEmpty(teahplayUp.getPicUrl()) || StringUtils.isEmpty(teahplayUp.getId())){
			model.addAttribute("errorInfo", "信息不能为空");
		}else{
			teachplayService.addInfo(teahplayUp);
		}
		return "redirect:teachplayAdminQuery";
	}
	//后台显示
	@RequestMapping("/teachplayAdminQuery")
	public String bannerPicQuery(TeahplayUp teahplayUp,Model model){
		
		List<TeahplayUp> teachplayList =teachplayService.queryFile(teahplayUp);
		model.addAttribute("teachplayList",teachplayList);
		return "admin/teachplay_admin";
	}
	
	//前台数据显示
	@RequestMapping("/teachplayBeforeQuery")
	public String taeachplayQuery(TeahplayUp teahplayUp,Model model){
		
		List<TeahplayUp> teachplayList =teachplayService.queryFile(teahplayUp);
		model.addAttribute("teachplayList",teachplayList);
		return "before/teachplay";
	}
	
	//删除
	@RequestMapping("/teachplyDelete")
	public String delete(@RequestParam(value="id",required=false)String[] ids,Model model){
		if(ids!=null){
			teachplayService.teachDelete(ids);
			}
		return "redirect:teachplayAdminQuery";
	}
	
	@RequestMapping("/download")
	public String download(@RequestParam(value = "id") int id, HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		TeahplayUp teahplayUpFile = teachplayService.queryById(id);
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
