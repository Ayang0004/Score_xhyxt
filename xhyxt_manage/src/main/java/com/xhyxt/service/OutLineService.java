package com.xhyxt.service;

import java.util.List;

import com.xhyxt.pojo.FileUploads;

public interface OutLineService {

	void addInfo(FileUploads fileUploads);

	List<FileUploads> queryFile(FileUploads fileUploads);

	void outlineDelete(String[] ids);


}
