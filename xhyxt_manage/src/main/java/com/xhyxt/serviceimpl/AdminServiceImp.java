package com.xhyxt.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhyxt.mapper.AdminMapper;
import com.xhyxt.pojo.Admin;
import com.xhyxt.service.AdminService;

@Service
public class AdminServiceImp implements AdminService {

	@Autowired
	private AdminMapper adminMapper;
	@Override
	public Admin login(String username, String password) {
		return adminMapper.login(username,password);
	}
	@Override
	public void addAdmin(Admin admin) {
		admin.setCreateDate(new Date());
		adminMapper.addAdmin(admin);
	}
	@Override
	public List<Admin> queryAdminList(Admin admin) {
		return adminMapper.queryAdminList(admin);
	}
	@Override
	public Admin findById(String id) {
		return adminMapper.findById(id);
	}
	@Override
	public void updateAdmin(Admin admin) {
		admin.setCreateDate(new Date());
		adminMapper.updateAdmin(admin);
	}
	@Override
	public void adminDelete(String[] ids) {
		adminMapper.adminDelete(ids);
	}

}
