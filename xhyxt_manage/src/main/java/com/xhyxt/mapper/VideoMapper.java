package com.xhyxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.xhyxt.pojo.VideoUp;

@Repository
public interface VideoMapper {
	
	@Insert("Insert into tb_videoup (fileName,fileTitle,fileCategory,picUrl,status,created,updated) values(#{videoUp.fileName},#{videoUp.fileTitle},#{videoUp.fileCategory},#{videoUp.picUrl},#{videoUp.status},#{videoUp.created},#{videoUp.updated})")
	void addInfo(@Param("videoUp")VideoUp videoUp);
	
	@Select("select * from tb_videoup order by created desc")
	List<VideoUp> queryFile(@Param("videoUp")VideoUp videoUp);

	void videoDelete(String[] ids);

	@Select("select * from tb_videoup where id=#{id}")
	VideoUp queryById(int id);

}
