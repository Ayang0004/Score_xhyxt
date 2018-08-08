package com.xhyxt.service;

import java.util.List;

import com.xhyxt.pojo.TeachTeam;

public interface TeachTeamService {

	void addInfo(TeachTeam teachTeam);

	List<TeachTeam> queryteachLeader(TeachTeam teachTeam);

	TeachTeam queryLeaderInfo(TeachTeam teachTeam);

	void teachLeaderDelete(String[] ids);

	void addTeachersInfo(TeachTeam teachTeam);

	List<TeachTeam> queryCourseTeachers(TeachTeam teachTeam);

	TeachTeam queryTeachersInfo(TeachTeam teachTeam);

	void CourseTeachersDelete(String[] ids);

	void addTeamInfo(TeachTeam teachTeam);

	List<TeachTeam> queryCourseTeam(TeachTeam teachTeam);

	TeachTeam queryTeamInfo(TeachTeam teachTeam);

	void CourseTeamDelete(String[] ids);

}
