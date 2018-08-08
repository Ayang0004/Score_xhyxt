package com.xhyxt.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 课程介绍
 * @author Administrator
 *
 */
@Entity
@Table(name="tb_courseintrod")
public class CourseIntrod {

	private int id;
	private String courseIntrod;
	private String introdCont;
	private String courseFeatures;
	private String featuresCont;
	private String courseHistory;
	private String historyCont;
	private String teach;
	private String teachCont;
	private Date created;
	
	public String getFeaturesCont() {
		return featuresCont;
	}
	public void setFeaturesCont(String featuresCont) {
		this.featuresCont = featuresCont;
	}
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
	public String getCourseIntrod() {
		return courseIntrod;
	}
	public void setCourseIntrod(String courseIntrod) {
		this.courseIntrod = courseIntrod;
	}
	public String getIntrodCont() {
		return introdCont;
	}
	public void setIntrodCont(String introdCont) {
		this.introdCont = introdCont;
	}
	public String getCourseFeatures() {
		return courseFeatures;
	}
	public void setCourseFeatures(String courseFeatures) {
		this.courseFeatures = courseFeatures;
	}
	public String getCourseHistory() {
		return courseHistory;
	}
	public void setCourseHistory(String courseHistory) {
		this.courseHistory = courseHistory;
	}
	public String getHistoryCont() {
		return historyCont;
	}
	public void setHistoryCont(String historyCont) {
		this.historyCont = historyCont;
	}
	public String getTeach() {
		return teach;
	}
	public void setTeach(String teach) {
		this.teach = teach;
	}
	public String getTeachCont() {
		return teachCont;
	}
	public void setTeachCont(String teachCont) {
		this.teachCont = teachCont;
	}
	
}
