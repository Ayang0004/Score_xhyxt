package com.xhyxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.xhyxt.pojo.BannerPicUp;
@Repository
public interface BannerMapper {
	
	@Insert("insert into tb_picupload (picName,picTitle,picCategory,picUrl,picStatus,created,updated) values(#{bannerPicUp.picName},#{bannerPicUp.picTitle},#{bannerPicUp.picCategory},#{bannerPicUp.picUrl},#{bannerPicUp.picStatus},#{bannerPicUp.created},#{bannerPicUp.updated})")
	public void addInfo(@Param("bannerPicUp")BannerPicUp bannerPicUp);
	
	@Select("select * from tb_picupload order by created desc")
	public List<BannerPicUp> queryPic(@Param("bannerPicUp")BannerPicUp bannerPicUp);
	
	@Select("select * from tb_picupload where id=#{bannerPicUp.id}")
	public BannerPicUp findOne(@Param("bannerPicUp")String id);
	
	@Select("select * from tb_picupload where id=#{id}")
	public List<BannerPicUp> findAll();
	
	@Update("update tb_picupload set picName=#{bannerPicUp.picName},picTitle=#{bannerPicUp.picTitle},picCategory=#{bannerPicUp.picCategory} where id=#{bannerPicUp.id}")
	public void updatePic(@Param("bannerPicUp")BannerPicUp bannerPicUp);
	
	
	public void picDelete(String[] ids);
	
	@Select("select * from tb_picupload where id=#{id}")
	public BannerPicUp findById(String id);

		
	

}
