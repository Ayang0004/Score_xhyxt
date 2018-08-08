package com.xhyxt.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_calendar")
public class Calendar {
	private int id;
	private String calTitle;
	private String calName;
	private String calCategory;
	private String calCont;
	private String calStatus;
	private Date created;
	private Date updated;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCalTitle() {
		return calTitle;
	}
	public void setCalTitle(String calTitle) {
		this.calTitle = calTitle;
	}
	
	public String getCalName() {
		return calName;
	}
	public void setCalName(String calName) {
		this.calName = calName;
	}
	public String getCalCategory() {
		return calCategory;
	}
	public void setCalCategory(String calCategory) {
		this.calCategory = calCategory;
	}
	public String getCalCont() {
		return calCont;
	}
	public void setCalCont(String calCont) {
		this.calCont = calCont;
	}
	public String getCalStatus() {
		return calStatus;
	}
	public void setCalStatus(String calStatus) {
		this.calStatus = calStatus;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
}
