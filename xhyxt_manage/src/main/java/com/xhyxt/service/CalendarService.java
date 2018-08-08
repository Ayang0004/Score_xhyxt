package com.xhyxt.service;

import java.util.List;

import com.xhyxt.pojo.Calendar;

public interface CalendarService {

	void addInfo(Calendar calendar);

	List<Calendar> queryFile(Calendar calendar);

	void calendarDelete(String[] ids);

	Calendar findById(String id);

	void updateFile(Calendar calendar);

}
