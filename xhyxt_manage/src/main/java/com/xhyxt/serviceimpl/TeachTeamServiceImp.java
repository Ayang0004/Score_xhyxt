package com.xhyxt.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhyxt.mapper.TeachTeamMapper;
import com.xhyxt.pojo.TeachTeam;
import com.xhyxt.service.TeachTeamService;

@Service
public class TeachTeamServiceImp implements TeachTeamService {

	@Autowired
	private TeachTeamMapper teachTeamMapper;
	
	@Override
	public void addInfo(TeachTeam teachTeam) {
		teachTeam.setCreated(new Date());
		teachTeamMapper.addInfo(teachTeam);
	}

	@Override
	public List<TeachTeam> queryteachLeader(TeachTeam teachTeam) {
		return teachTeamMapper.queryteachLeader(teachTeam);
	}

	@Override
	public TeachTeam queryLeaderInfo(TeachTeam teachTeam) {
		return teachTeamMapper.queryLeaderInfo(teachTeam);
	}

	@Override
	public void teachLeaderDelete(String[] ids) {
		teachTeamMapper.teachLeaderDelete(ids);
	}

	@Override
	public void addTeachersInfo(TeachTeam teachTeam) {
		teachTeam.setCreated(new Date());
		teachTeamMapper.addTeachersInfo(teachTeam);
	}

	@Override
	public List<TeachTeam> queryCourseTeachers(TeachTeam teachTeam) {
		return teachTeamMapper.queryCourseTeachers(teachTeam);
	}

	@Override
	public TeachTeam queryTeachersInfo(TeachTeam teachTeam) {
		return teachTeamMapper.queryTeachersInfo(teachTeam);
	}

	@Override
	public void CourseTeachersDelete(String[] ids) {
		teachTeamMapper.CourseTeachersDelete(ids);
	}

	@Override
	public void addTeamInfo(TeachTeam teachTeam) {
		teachTeam.setCreated(new Date());
		teachTeamMapper.addTeamInfo(teachTeam);
	}

	@Override
	public List<TeachTeam> queryCourseTeam(TeachTeam teachTeam) {
		return teachTeamMapper.queryCourseTeam(teachTeam);
	}

	@Override
	public TeachTeam queryTeamInfo(TeachTeam teachTeam) {
		return teachTeamMapper.queryTeamInfo(teachTeam);
	}

	@Override
	public void CourseTeamDelete(String[] ids) {
		teachTeamMapper.CourseTeamDelete(ids);
	}

}
