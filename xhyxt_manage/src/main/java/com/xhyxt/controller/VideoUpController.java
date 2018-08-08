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

import com.xhyxt.pojo.VideoUp;
import com.xhyxt.service.VideoService;

/**
 * 视频上传管理
 * @author Administrator
 *
 */
@Controller
public class VideoUpController {
	
	@Autowired
	private VideoService videoService;
	//电子视频管理
	@RequestMapping("video_admin")
	public String Video_admin(){ return "admin/video_admin";}
				
	//电子视频添加
	@RequestMapping("video_admin_add")
	public String Video_admin_add(){ return "admin/video_admin_add";}
	
	//后台视频上传
	@RequestMapping("/videoFileAdd")
	public String videoAdd(VideoUp videoUp,Model model,HttpServletResponse response){
		
		response.setContentType("text/html;charset=utf-8");
		if(StringUtils.isEmpty(videoUp.getFileTitle()) || StringUtils.isEmpty(videoUp.getFileCategory()) || StringUtils.isEmpty(videoUp.getPicUrl()) || StringUtils.isEmpty(videoUp.getId())){
			model.addAttribute("errorInfo", "信息不能为空");
		}else{
			videoService.addInfo(videoUp);
		}
		return "redirect:videoFileQuery";
	}
	//后台数据显示
	@RequestMapping("/videoFileQuery")
	public String videoQuery(VideoUp videoUp,Model model){
		
		List<VideoUp> videoList =videoService.queryFile(videoUp);
		model.addAttribute("videoList",videoList);
		return "admin/video_admin";
	}
	
	//前台数据显示
	@RequestMapping("/videoBeforeQuery")
	public String videoQuery2(VideoUp videoUp,Model model){
		
		List<VideoUp> videoList =videoService.queryFile(videoUp);
		model.addAttribute("videoList",videoList);
		return "before/video";
	}
	
	//删除
	@RequestMapping("/videoDelete")
	public String delete(@RequestParam(value="id",required=false)String[] ids,Model model){
		if(ids!=null){
			videoService.videoDelete(ids);
		}
		return "redirect:videoFileQuery";
	}
	
	@RequestMapping("/downloadVideo")
	public String downloadVideo(@RequestParam(value = "id") int id, HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		VideoUp videoUpFile = videoService.queryById(id);
		String fileName = videoUpFile.getFileName();
		response.setCharacterEncoding("utf-8");
		response.setContentType("multipart/form-data");
		response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(fileName, "UTF-8"));
		try {
			String path = videoUpFile.getPicUrl();
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
