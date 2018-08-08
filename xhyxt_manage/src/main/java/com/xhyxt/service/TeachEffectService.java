package com.xhyxt.service;

import java.util.List;

import com.xhyxt.pojo.TeachEffect;

public interface TeachEffectService {

	void addInfo(TeachEffect teachEffect);

	List<TeachEffect> queryteachEffect(TeachEffect teachEffect);

	TeachEffect queryEffectInfo(TeachEffect teachEffect);

	void teachEffectDelete(String[] ids);

}
