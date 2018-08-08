package com.xhyxt.service;

import java.util.List;

import com.xhyxt.pojo.TeachMethod;

public interface TeachMethodService {

	void addInfo(TeachMethod teachMethod);

	List<TeachMethod> queryteachEffect(TeachMethod teachMethod);

	TeachMethod queryMethodInfo(TeachMethod teachMethod);

	void teachmethodDelete(String[] ids);


}
