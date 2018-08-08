package com.xhyxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.xhyxt.pojo.CourseIntrod;

@Repository
public interface CourseIntrodMapper {

	//@Insert("Insert into tb_courseIntrod (courseIntrod,introdCont,courseFeatures,featuresCont,courseHistory,historyCont,teach,teachCont,created) values(#{courseIntrod.courseIntrod},#{courseIntrod.introdCont},#{courseIntrod.courseFeatures},#{courseIntrod.featuresCont},#{courseIntrod.courseHistory},#{courseIntrod.historyCont},#{courseIntrod.teach},#{courseIntrod.teachCont},#{courseIntrod.created})")
	
	//课程介绍
	@Insert("Insert into tb_courseintrod (courseIntrod,introdCont,created) values(#{courseIntrod.courseIntrod},#{courseIntrod.introdCont},#{courseIntrod.created})")
	void addInfo(@Param("courseIntrod")CourseIntrod courseIntrod);
	
	@Select("select * from tb_courseintrod where courseIntrod='课程介绍'")
	List<CourseIntrod> queryCourseIntrod(CourseIntrod courseIntrod);

	@Select("select * from tb_courseintrod where courseIntrod='课程介绍'")
	CourseIntrod queryIntrodInfo(CourseIntrod courseIntrod);

	void CourseIntrodDelete(String[] ids);

	//课程特色
	@Insert("Insert into tb_courseintrod (courseFeatures,featuresCont,created) values(#{courseIntrod.courseFeatures},#{courseIntrod.featuresCont},#{courseIntrod.created})")
	void addFeaturesInfo(@Param("courseIntrod")CourseIntrod courseIntrod);
	
	@Select("select * from tb_courseintrod where courseFeatures='课程特色'")
	List<CourseIntrod> queryCourseFeatures(CourseIntrod courseIntrod);

	void CourseFeaturesDelete(String[] ids);
	
	@Select("select * from tb_courseintrod where courseFeatures='课程特色'")
	CourseIntrod queryFeaturesInfo(CourseIntrod courseIntrod);

	
	//课程历史沿革
	@Insert("Insert into tb_courseintrod (courseHistory,HistoryCont,created) values(#{courseIntrod.courseHistory},#{courseIntrod.historyCont},#{courseIntrod.created})")
	void addHistoryInfo(@Param("courseIntrod")CourseIntrod courseIntrod);

	@Select("select * from tb_courseintrod where courseHistory='课程历史沿革'")
	List<CourseIntrod> queryCourseHistory(CourseIntrod courseIntrod);
	
	@Select("select * from tb_courseintrod where courseHistory='课程历史沿革'")
	CourseIntrod queryHistoryInfo(CourseIntrod courseIntrod);

	void CourseHistoryDelete(String[] ids);

}
