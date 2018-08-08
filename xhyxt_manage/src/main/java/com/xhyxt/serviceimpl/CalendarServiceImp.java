package com.xhyxt.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhyxt.mapper.CalendarMapper;
import com.xhyxt.pojo.Calendar;
import com.xhyxt.service.CalendarService;

@Service
public class CalendarServiceImp implements CalendarService {
	
	@Autowired
	private CalendarMapper calendarMapper;
	@Override
	public void addInfo(Calendar calendar) {
		calendar.setCreated(new Date());
		calendar.setUpdated(new Date());
		calendarMapper.addInfo(calendar);
	}

	@Override
	public List<Calendar> queryFile(Calendar calendar) {
		return calendarMapper.queryCont(calendar);
	}

	@Override
	public void calendarDelete(String[] ids) {
		calendarMapper.calendarDelete(ids);
	}

	@Override
	public Calendar findById(String id) {
		return calendarMapper.findById(id);
	}

	@Override
	public void updateFile(Calendar calendar) {
		calendarMapper.updateFile(calendar);
	}

}
