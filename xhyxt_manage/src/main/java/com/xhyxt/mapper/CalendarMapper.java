package com.xhyxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.xhyxt.pojo.Calendar;

@Repository
public interface CalendarMapper {
	
	@Insert("Insert into tb_calendar (calName,calTitle,calCategory,calCont,calStatus,created,updated) values(#{calendar.calName},#{calendar.calTitle},#{calendar.calCategory},#{calendar.calCont},#{calendar.calStatus},#{calendar.created},#{calendar.updated})")
	void addInfo(@Param("calendar")Calendar calendar);
	
	@Select("select * from tb_calendar order by created desc")
	List<Calendar> queryCont(@Param("calendar")Calendar calendar);

	void calendarDelete(String[] ids);

	@Select("select * from tb_calendar where id=#{id}")
	Calendar findById(String id);

	@Update("update tb_calendar set calName=#{calendar.calName},calTitle=#{calendar.calTitle},calCategory=#{calendar.calCategory} where id=#{calendar.id}")
	void updateFile(@Param("calendar")Calendar calendar);


}
