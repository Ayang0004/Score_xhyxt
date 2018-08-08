package com.xhyxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.xhyxt.pojo.TeahplayUp;

@Repository
public interface TeachplayMapper {
	
	@Insert("Insert into tb_teachup (fileName,fileTitle,fileCategory,picUrl,status,created,updated) values(#{teahplayUp.fileName},#{teahplayUp.fileTitle},#{teahplayUp.fileCategory},#{teahplayUp.picUrl},#{teahplayUp.status},#{teahplayUp.created},#{teahplayUp.updated})")
	void addInfo(@Param("teahplayUp")TeahplayUp teahplayUp);

	@Select("select * from tb_teachup order by id asc")
	List<TeahplayUp> queryFile(@Param("teahplayUp")TeahplayUp teahplayUp);
	
	
	void teachDelete(String[] ids);
	
	@Select("select * from tb_teachup where id=#{id}")
	TeahplayUp queryById(int id);

}
