package com.xhyxt.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name=("tb_admin"))
public class Admin extends BaseEntity {
	private int id;
	private String username;
	private String relname;
	private String password;
	private String password2;
	private String adminLevel;
	private String uppassword;
	private String email;
	private String phone;
	private Date createDate;
	
	private Admin admin;

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String getRelname() {
		return relname;
	}

	public void setRelname(String relname) {
		this.relname = relname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getAdminLevel() {
		return adminLevel;
	}

	public void setAdminLevel(String adminLevel) {
		this.adminLevel = adminLevel;
	}

	public String getUppassword() {
		return uppassword;
	}

	public void setUppassword(String uppassword) {
		this.uppassword = uppassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
