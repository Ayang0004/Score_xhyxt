package com.xhyxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.xhyxt.pojo.TeachContent;

@Repository
public interface TeachContentMapper {

	@Insert("Insert into tb_teachcontent (theoryTeach,theoryCont,created) values(#{teachContent.theoryTeach},#{teachContent.theoryCont},#{teachContent.created})")
	void addInfo(@Param("teachContent")TeachContent teachContent);

	@Select("select * from tb_teachcontent where theoryTeach='理论教学'")
	List<TeachContent> queryteachTheory(TeachContent teachContent);
	
	@Select("select * from tb_teachcontent where theoryTeach='理论教学'")
	TeachContent queryTheoryInfo(TeachContent teachContent);

	void teachTheoryDelete(String[] ids);

	@Insert("Insert into tb_teachcontent (practiceTeach,practiceCont,created) values(#{teachContent.practiceTeach},#{teachContent.practiceCont},#{teachContent.created})")
	void addParcticeInfo(@Param("teachContent")TeachContent teachContent);
	
	@Select("select * from tb_teachcontent where practiceTeach='实践教学'")
	List<TeachContent> queryTeachParctice(TeachContent teachContent);
	
	@Select("select * from tb_teachcontent where practiceTeach='实践教学'")
	TeachContent queryParcticeInfo(TeachContent teachContent);

	void teachParcticeDelete(String[] ids);

	
	@Insert("Insert into tb_teachcontent (teachOrg,orgCont,created) values(#{teachContent.teachOrg},#{teachContent.orgCont},#{teachContent.created})")
	void addOrgInfo(@Param("teachContent")TeachContent teachContent);

	@Select("select * from tb_teachcontent where teachOrg='教学组织安排'")
	List<TeachContent> queryTeachOrg(TeachContent teachContent);
	
	@Select("select * from tb_teachcontent where teachOrg='教学组织安排'")
	TeachContent queryOrgInfo(TeachContent teachContent);

	void teachOrgDelete(String[] ids);

}
