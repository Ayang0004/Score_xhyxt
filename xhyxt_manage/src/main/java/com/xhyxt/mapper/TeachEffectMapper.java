package com.xhyxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.xhyxt.pojo.TeachEffect;

@Repository
public interface TeachEffectMapper {

	@Insert("Insert into tb_teacheffect (teachEffect,effectCont,created) values(#{teachEffect.teachEffect},#{teachEffect.effectCont},#{teachEffect.created})")
	void addInfo(@Param("teachEffect")TeachEffect teachEffect);

	@Select("select * from tb_teacheffect where teachEffect='教学效果'")
	List<TeachEffect> queryteachEffect(TeachEffect teachEffect);

	@Select("select * from tb_teacheffect where teachEffect='教学效果'")
	TeachEffect queryEffectInfo(TeachEffect teachEffect);

	void teachEffectDelete(String[] ids);

}
