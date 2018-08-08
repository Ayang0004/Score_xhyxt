package com.xhyxt.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_teachteam")
public class TeachTeam {
	
	private int id;
	private String courseLeader;
	private String leaderCont;
	private String courseTeach;
	private String teachCont;
	private String teachTeam;
	private String teamCont;
	private Date created;
	
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseLeader() {
		return courseLeader;
	}
	public void setCourseLeader(String courseLeader) {
		this.courseLeader = courseLeader;
	}
	public String getLeaderCont() {
		return leaderCont;
	}
	public void setLeaderCont(String leaderCont) {
		this.leaderCont = leaderCont;
	}
	public String getCourseTeach() {
		return courseTeach;
	}
	public void setCourseTeach(String courseTeach) {
		this.courseTeach = courseTeach;
	}
	public String getTeachCont() {
		return teachCont;
	}
	public void setTeachCont(String teachCont) {
		this.teachCont = teachCont;
	}
	public String getTeachTeam() {
		return teachTeam;
	}
	public void setTeachTeam(String teachTeam) {
		this.teachTeam = teachTeam;
	}
	public String getTeamCont() {
		return teamCont;
	}
	public void setTeamCont(String teamCont) {
		this.teamCont = teamCont;
	}
	
	

}
