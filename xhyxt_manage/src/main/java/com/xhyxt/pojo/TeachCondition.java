package com.xhyxt.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/*
 * 教学条件信息表
 */
@Entity
@Table(name="tb_teachcondition")
public class TeachCondition {
	
	private int id;
	private String textBooks;
	private String textCont;
	private String practiceCond;
	private String condCont;
	private String netCond;
	private String netCont;
	private Date created;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTextBooks() {
		return textBooks;
	}
	public void setTextBooks(String textBooks) {
		this.textBooks = textBooks;
	}
	public String getTextCont() {
		return textCont;
	}
	public void setTextCont(String textCont) {
		this.textCont = textCont;
	}
	public String getPracticeCond() {
		return practiceCond;
	}
	public void setPracticeCond(String practiceCond) {
		this.practiceCond = practiceCond;
	}
	public String getCondCont() {
		return condCont;
	}
	public void setCondCont(String condCont) {
		this.condCont = condCont;
	}
	public String getNetCond() {
		return netCond;
	}
	public void setNetCond(String netCond) {
		this.netCond = netCond;
	}
	public String getNetCont() {
		return netCont;
	}
	public void setNetCont(String netCont) {
		this.netCont = netCont;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	

}
