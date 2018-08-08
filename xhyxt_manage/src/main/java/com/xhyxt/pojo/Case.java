package com.xhyxt.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 案例库信息表
 * @author Administrator
 *
 */
@Entity
@Table(name="tb_case")
public class Case {
	
	private int id;
	private String caseTitle;
	private String picUrl;
	private String caseCont;
	private Date created;
	private Case cases;
	
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public Case getCases() {
		return cases;
	}
	public void setCases(Case cases) {
		this.cases = cases;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCaseTitle() {
		return caseTitle;
	}
	public void setCaseTitle(String caseTitle) {
		this.caseTitle = caseTitle;
	}
	public String getCaseCont() {
		return caseCont;
	}
	public void setCaseCont(String caseCont) {
		this.caseCont = caseCont;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

}
