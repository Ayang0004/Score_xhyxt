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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xhyxt.pojo.Case;
import com.xhyxt.service.CaseService;

/**
 * 案例库
 * @author Administrator
 *
 */
@Controller
public class CaseController {

	@Autowired
	private  CaseService caseService;
	
	@RequestMapping("teach_Case_admin")
	public String teach_Case_admin(){ return "admin/teach_Case_admin";}
	
	// 案例库信息添加
	@RequestMapping("teach_Case_add")
	public String teach_Case_add() {
		return "admin/teach_Case_add";
	}

	// 后台添加
	@RequestMapping("/teachCaseAdd")
	public String teachCaseAdd(Case cases, Model model, HttpServletResponse response) {

		response.setContentType("text/html;charset=utf-8");
		caseService.addInfo(cases);
			return "redirect:teachCaseQuery";
	}

	// 后台显示
	@RequestMapping("/teachCaseQuery")
	public String teachCaseQuery(Case cases, Model model) {

		List<Case> CaseList = caseService.queryCaseList(cases);
		model.addAttribute("CaseList", CaseList);
		return "admin/teach_Case_admin";
	}

	
	// 前台显示
	@RequestMapping("/teachCaseBeforeInfoListQuery")
	public String teachCaseBeforeInfoListQuery(Case cases, Model model) {

		List<Case> caseList = caseService.queryCaseList(cases);
		model.addAttribute("caseList", caseList);
		return "before/casesList";
	}
	// 前台动态详细内容展示
	@RequestMapping("/teachCaseBeforeInfoQuery")
	public String teachCaseBeforeInfoQuery(String id, Model model) {

		Case CaseContInfo = caseService.queryCaseContInfo(id);
		model.addAttribute("CaseContInfo", CaseContInfo);
		return "before/teachCase_info";
	}

	// 删除
	@RequestMapping("/teachCaseDelete")
	public String teachCaseDelete(@RequestParam(value = "id", required = false) String[] ids, Model model) {
		if (ids != null) {
			caseService.teachCaseDelete(ids);
		}
		return "redirect:teachCaseQuery";
	}
	@RequestMapping("/downloadCase")
	public String downloadCase(@RequestParam(value = "id") int id, HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		Case caseFile = caseService.queryById(id);
		String fileName = caseFile.getCaseTitle();
		response.setCharacterEncoding("utf-8");
		response.setContentType("multipart/form-data");
		response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(fileName, "UTF-8"));
		try {
			String path = caseFile.getPicUrl();
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
