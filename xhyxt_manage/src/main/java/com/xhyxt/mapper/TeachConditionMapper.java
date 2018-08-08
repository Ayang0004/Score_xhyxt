package com.xhyxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.xhyxt.pojo.TeachCondition;

@Repository
public interface TeachConditionMapper {
	
	@Insert("Insert into tb_teachcondition (textBooks,textCont,created) values(#{teachCondition.textBooks},#{teachCondition.textCont},#{teachCondition.created})")
	void addInfo(@Param("teachCondition")TeachCondition teachCondition);

	@Select("select * from tb_teachcondition where textBooks='教材及教学内容'")
	List<TeachCondition> queryteachTextbooks(TeachCondition teachCondition);
	
	@Select("select * from tb_teachcondition where textBooks='教材及教学内容'")
	TeachCondition queryTextbooksInfo(TeachCondition teachCondition);

	void teachTextooksDelete(String[] ids);

	@Select("select * from tb_teachcondition where netCond='网络教学条件'")
	List<TeachCondition> queryteachNet(TeachCondition teachCondition);
	
	@Select("select * from tb_teachcondition where netCond='网络教学条件'")
	TeachCondition queryNetInfo(TeachCondition teachCondition);

	void teachNetDelete(String[] ids);

	@Insert("Insert into tb_teachcondition (netCond,netCont,created) values(#{teachCondition.netCond},#{teachCondition.netCont},#{teachCondition.created})")
	void addNetInfo(@Param("teachCondition")TeachCondition teachCondition);

}
