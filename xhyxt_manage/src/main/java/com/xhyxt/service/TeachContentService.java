package com.xhyxt.service;

import java.util.List;

import com.xhyxt.pojo.TeachContent;

public interface TeachContentService {

	void addInfo(TeachContent teachContent);

	List<TeachContent> queryteachTheory(TeachContent teachContent);

	TeachContent queryTheoryInfo(TeachContent teachContent);

	void teachTheoryDelete(String[] ids);

	void addParcticeInfo(TeachContent teachContent);

	List<TeachContent> queryTeachParctice(TeachContent teachContent);

	TeachContent queryParcticeInfo(TeachContent teachContent);

	void teachParcticeDelete(String[] ids);

	void addOrgInfo(TeachContent teachContent);

	List<TeachContent> queryTeachOrg(TeachContent teachContent);

	TeachContent queryOrgInfo(TeachContent teachContent);

	void teachOrgDelete(String[] ids);

}
