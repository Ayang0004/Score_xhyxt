package com.xhyxt.service;

import java.util.List;

import com.xhyxt.pojo.Admin;

public interface AdminService {

	Admin login(String username, String password);

	void addAdmin(Admin admin);

	List<Admin> queryAdminList(Admin admin);

	Admin findById(String id);

	void updateAdmin(Admin admin);

	void adminDelete(String[] ids);


}
