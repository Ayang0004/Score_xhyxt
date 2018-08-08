package com.xhyxt.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.xhyxt.tools.PicUploadResult;

@Entity
@Table(name="tb_picupload")
public class BannerPicUp extends PicUploadResult  {
	
	private int id;
	private String picTitle;
	private String picCategory;
	private String picName;
	private String picUrl;
	private String picStatus;
	
	public int getId() {
		return id;
	}
	public String getPicTitle() {
		return picTitle;
	}
	public void setPicTitle(String picTitle) {
		this.picTitle = picTitle;
	}
	public String getPicCategory() {
		return picCategory;
	}
	public void setPicCategory(String picCategory) {
		this.picCategory = picCategory;
	}
	public String getPicStatus() {
		return picStatus;
	}
	public void setPicStatus(String picStatus) {
		this.picStatus = picStatus;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPicName() {
		return picName;
	}
	public void setPicName(String picName) {
		this.picName = picName;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	
	
	
}
