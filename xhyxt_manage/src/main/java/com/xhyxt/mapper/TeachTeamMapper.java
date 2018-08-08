package com.xhyxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.xhyxt.pojo.TeachTeam;

@Repository
public interface TeachTeamMapper {
	
	@Insert("Insert into tb_teachteam (courseLeader,leaderCont,created) values(#{teachTeam.courseLeader},#{teachTeam.leaderCont},#{teachTeam.created})")
	void addInfo(@Param("teachTeam")TeachTeam teachTeam);

	@Select("select * from tb_teachteam where courseLeader='课程负责人'")
	List<TeachTeam> queryteachLeader(TeachTeam teachTeam);
	
	@Select("select * from tb_teachteam where courseLeader='课程负责人'")
	TeachTeam queryLeaderInfo(TeachTeam teachTeam);

	void teachLeaderDelete(String[] ids);

	
	@Insert("Insert into tb_teachteam (courseTeach,teachCont,created) values(#{teachTeam.courseTeach},#{teachTeam.teachCont},#{teachTeam.created})")
	void addTeachersInfo(@Param("teachTeam")TeachTeam teachTeam);

	@Select("select * from tb_teachteam where courseTeach='课程主讲教师'")
	List<TeachTeam> queryCourseTeachers(TeachTeam teachTeam);
	
	@Select("select * from tb_teachteam where courseTeach='课程主讲教师'")
	TeachTeam queryTeachersInfo(TeachTeam teachTeam);

	void CourseTeachersDelete(String[] ids);

	
	
	@Insert("Insert into tb_teachteam (teachTeam,teamCont,created) values(#{teachTeam.teachTeam},#{teachTeam.teamCont},#{teachTeam.created})")
	void addTeamInfo(@Param("teachTeam")TeachTeam teachTeam);
	
	@Select("select * from tb_teachteam where teachTeam='教学组织结构'")
	List<TeachTeam> queryCourseTeam(TeachTeam teachTeam);
	
	@Select("select * from tb_teachteam where teachTeam='教学组织结构'")
	TeachTeam queryTeamInfo(TeachTeam teachTeam);

	void CourseTeamDelete(String[] ids);

}
