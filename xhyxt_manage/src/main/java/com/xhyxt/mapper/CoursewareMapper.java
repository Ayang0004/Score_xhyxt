package com.xhyxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.xhyxt.pojo.CoursewareUp;
import com.xhyxt.pojo.TeahplayUp;

@Repository
public interface CoursewareMapper {
	
	@Insert("Insert into tb_coursewareup (fileName,fileTitle,fileCategory,picUrl,status,created,updated) values(#{coursewareUp.fileName},#{coursewareUp.fileTitle},#{coursewareUp.fileCategory},#{coursewareUp.picUrl},#{coursewareUp.status},#{coursewareUp.created},#{coursewareUp.updated})")
	void addInfo(@Param("coursewareUp")CoursewareUp coursewareUp);
	
	@Select("select * from tb_coursewareup order by id asc")
	List<CoursewareUp> queryFile(@Param("coursewareUp")CoursewareUp coursewareUp);

	void courseDelete(String[] ids);
	
	@Select("select * from tb_coursewareup where id=#{id}")
	TeahplayUp queryById(int id);

}
