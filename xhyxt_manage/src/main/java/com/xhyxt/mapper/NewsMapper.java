package com.xhyxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.xhyxt.pojo.NewsPublish;

@Repository
public interface NewsMapper {
	
	@Insert("Insert into tb_news (newsName,newsTitle,newsCategory,newsCont,status,created,updated) values(#{newsPublish.newsName},#{newsPublish.newsTitle},#{newsPublish.newsCategory},#{newsPublish.newsCont},#{newsPublish.status},#{newsPublish.created},#{newsPublish.updated})")
	void addInfo(@Param("newsPublish")NewsPublish newsPublish);
	
	@Select("select * from tb_news order by created desc")
	List<NewsPublish> queryNews(@Param("newsPublish")NewsPublish newsPublish);

	@Select("select * from tb_news where id=#{id}")
	NewsPublish findById(String id);
	
	@Update("update tb_news set newsName=#{newsPublish.newsName},newsTitle=#{newsPublish.newsTitle},newsCategory=#{newsPublish.newsCategory} where id=#{newsPublish.id}")
	void updateNews(@Param("newsPublish")NewsPublish newsPublish);

	void newsDelete(String[] ids);
	
	@Select("select * from tb_news where id=#{id}")
	NewsPublish queryNewsInfo(String id);

		
}
