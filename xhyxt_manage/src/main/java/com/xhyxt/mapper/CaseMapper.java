package com.xhyxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.xhyxt.pojo.Case;

@Repository
public interface CaseMapper {

	@Insert("Insert into tb_case (caseTitle,picUrl,caseCont,created) values(#{case.caseTitle},#{case.picUrl},#{case.caseCont},#{case.created})")
	void addInfo(@Param("case")Case cases);

	void teachCaseDelete(String[] ids);

	@Select("select * from tb_case order by created desc")
	List<Case> queryCaseList(Case cases);

	@Select("select * from tb_case where id=#{id}")
	Case queryCaseContInfo(String id);
	
	@Select("select * from tb_case where id=#{id}")
	Case queryById(int id);

}
