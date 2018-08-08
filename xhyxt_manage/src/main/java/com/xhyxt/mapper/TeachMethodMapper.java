package com.xhyxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.xhyxt.pojo.TeachMethod;

@Repository
public interface TeachMethodMapper {
	
	@Insert("Insert into tb_teachmethod (teachMethod,methodCont,created) values(#{teachMethod.teachMethod},#{teachMethod.methodCont},#{teachMethod.created})")
	void addInfo(@Param("teachMethod")TeachMethod teachMethod);
	
	@Select("select * from tb_teachmethod where teachMethod='教学方法'")
	List<TeachMethod> queryteachEffect(TeachMethod teachMethod);

	@Select("select * from tb_teachmethod where teachMethod='教学方法'")
	TeachMethod queryMethodInfo(TeachMethod teachMethod);

	void teachmethodDelete(String[] ids);

}
