package com.xhyxt.tools;

import java.util.Date;

public class PicUploadResult {
	private Integer error = 0; // 图片上传错误不能抛出，抛出就无法进行jsp页面回调，所以设置这个标识，0表示无异常，1代表异常
	private String picUrl;
	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	private Date created;
	private Date updated;

	public Integer getError() {
		return error;
	}

	public void setError(Integer error) {
		this.error = error;
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
