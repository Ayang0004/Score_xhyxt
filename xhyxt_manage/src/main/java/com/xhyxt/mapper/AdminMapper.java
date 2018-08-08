package com.xhyxt.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.xhyxt.pojo.Admin;

@Repository
public interface AdminMapper {
	
	@Select("select * from tb_admin where username=#{username} and password=#{password}")
	Admin login(@Param("username")String username, @Param("password")String password);
	
	
	@Insert ("insert into tb_admin (username,relname,password,adminLevel,email,phone,createDate) values (#{username.username},#{username.relname},#{username.password},#{username.adminLevel},#{username.email},#{username.phone},#{username.createDate})")
	void addAdmin(@Param("username")Admin admin);
	
	@Select("select * from tb_admin order by createDate desc")
	List<Admin> queryAdminList(@Param("username")Admin admin);


	@Select("select * from tb_admin where id=#{id}")
	Admin findById(String id);

	@Update("update tb_admin set username=#{admin.username},relname=#{admin.relname},password=#{admin.password},password2=#{admin.password2},adminLevel=#{admin.adminLevel},email=#{admin.email},phone=#{admin.phone},createDate=#{admin.createDate} where id=#{admin.id}")
	void updateAdmin(Admin admin);

	void adminDelete(String[] ids);

}
