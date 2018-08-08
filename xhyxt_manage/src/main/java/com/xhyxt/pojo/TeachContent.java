package com.xhyxt.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 教学内容信息表
 * @author Administrator
 *
 */
@Entity
@Table(name="tb_teachcontent")
public class TeachContent {
	private int id;
	private String theoryTeach;
	private String theoryCont;
	private String practiceTeach;
	private String practiceCont;
	private String teachOrg;
	private String orgCont;
	private Date created;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTheoryTeach() {
		return theoryTeach;
	}
	public void setTheoryTeach(String theoryTeach) {
		this.theoryTeach = theoryTeach;
	}
	public String getTheoryCont() {
		return theoryCont;
	}
	public void setTheoryCont(String theoryCont) {
		this.theoryCont = theoryCont;
	}
	public String getPracticeTeach() {
		return practiceTeach;
	}
	public void setPracticeTeach(String practiceTeach) {
		this.practiceTeach = practiceTeach;
	}
	public String getPracticeCont() {
		return practiceCont;
	}
	public void setPracticeCont(String practiceCont) {
		this.practiceCont = practiceCont;
	}
	public String getTeachOrg() {
		return teachOrg;
	}
	public void setTeachOrg(String teachOrg) {
		this.teachOrg = teachOrg;
	}
	public String getOrgCont() {
		return orgCont;
	}
	public void setOrgCont(String orgCont) {
		this.orgCont = orgCont;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
}
