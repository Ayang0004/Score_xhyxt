package com.xhyxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.xhyxt.pojo.FileUploads;

@Repository
public interface OutLineMapper {

	@Insert("Insert into tb_fileupload (fileName,fileTitle,fileCategory,picUrl,status,created,updated) values(#{fileUploads.fileName},#{fileUploads.fileTitle},#{fileUploads.fileCategory},#{fileUploads.picUrl},#{fileUploads.status},#{fileUploads.created},#{fileUploads.updated})")
	void addInfo(@Param("fileUploads")FileUploads fileUploads);

	@Select("select * from tb_fileupload order by created desc")
	List<FileUploads> queryPic(@Param("fileUploads")FileUploads fileUploads);

	void outlineDelete(String[] ids);


}
