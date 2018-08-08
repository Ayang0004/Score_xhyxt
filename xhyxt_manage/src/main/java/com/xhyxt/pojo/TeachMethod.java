package com.xhyxt.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 教学方法信息表
 * @author Administrator
 *
 */
@Entity
@Table(name="tb_teachmethod")
public class TeachMethod {
	private int id;
	private String teachMethod;
	private String methodCont;
	private Date created;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeachMethod() {
		return teachMethod;
	}
	public void setTeachMethod(String teachMethod) {
		this.teachMethod = teachMethod;
	}
	public String getMethodCont() {
		return methodCont;
	}
	public void setMethodCont(String methodCont) {
		this.methodCont = methodCont;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
}
