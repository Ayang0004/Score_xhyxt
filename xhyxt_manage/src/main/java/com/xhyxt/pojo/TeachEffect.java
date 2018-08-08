package com.xhyxt.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 教学效果信息表
 * @author Administrator
 *
 */
@Entity
@Table(name="tb_teacheffect")
public class TeachEffect {
	
	private int id;
	private String teachEffect;
	private String effectCont;
	private Date created;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeachEffect() {
		return teachEffect;
	}
	public void setTeachEffect(String teachEffect) {
		this.teachEffect = teachEffect;
	}
	public String getEffectCont() {
		return effectCont;
	}
	public void setEffectCont(String effectCont) {
		this.effectCont = effectCont;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
}
