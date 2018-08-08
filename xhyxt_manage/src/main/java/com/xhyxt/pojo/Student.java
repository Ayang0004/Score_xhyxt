package com.xhyxt.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.xhyxt.Utils.CheckString;
import com.xhyxt.exception.MyException;

@Entity
@Table(name="tb_student")
public class Student extends BaseEntity {
	private int id;
	private String stuNum; // 学号
	private String relname;
	private String password;
	private String password2;
	private String uppassword;
	private String email;
	private String valistr;
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	private Date createDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStuNum() {
		return stuNum;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public String getRelname() {
		return relname;
	}

	public void setRelname(String relname) {
		this.relname = relname;
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getValistr() {
		return valistr;
	}

	public void setValistr(String valistr) {
		this.valistr = valistr;
	}

	public void check() throws MyException {
		// 3、验证参数是否合法
		if (CheckString.isNull(stuNum)) {
			// 不合法，给予提示，并跳转到regist.jsp
			throw new MyException("请输入学/工号！");
		}
		if (CheckString.isNull(relname)) {
			// 不合法，给予提示，并跳转到regist.jsp
			throw new MyException("请输入真实姓名！");
		}
		if (CheckString.isNull(password)) {
			throw new MyException("密码不能为空!");
		}
		if (CheckString.isNull(password2)) {
			throw new MyException("确认密码不能为空！");
		}
		if (!password.equals(password2)) {
			throw new MyException("两次密码不相同！");
		}
		if (CheckString.isNull(email)) {
			throw new MyException("邮箱不能为空!");
		}
		if (!email.matches("^\\w+@\\w+(\\.\\w+)+$")) {
			throw new MyException("邮箱格式不正确！");
		}
	}
}
