package com.xhyxt.serviceimpl;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhyxt.mapper.BannerMapper;
import com.xhyxt.pojo.BannerPicUp;
import com.xhyxt.service.BannerService;

@Service
public class BannerServiceImpl implements BannerService{

	@Autowired
	private BannerMapper bannerMapper;
	@Override
	public void addInfo(BannerPicUp bannerPicUp) {
		bannerPicUp.setCreated(new Date());
		bannerPicUp.setUpdated(new Date());
		bannerMapper.addInfo(bannerPicUp);
	}
	@Override
	public List<BannerPicUp> queryPic(BannerPicUp bannerPicUp) {
		return bannerMapper.queryPic(bannerPicUp);
	}
	@Override
	public void updatePic(BannerPicUp bannerPicUp) {
		bannerMapper.updatePic(bannerPicUp);
	}
	@Override
	public void showPic(BannerPicUp bannerPicUp) {
		
	}
	@Override
	public BannerPicUp findOne(String id) {
		return bannerMapper.findOne(id);
	}
	@Override
	public void picDelete(String[] ids) {
		bannerMapper.picDelete(ids);
	}
	@Override
	public List<BannerPicUp> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public BannerPicUp findById(String id) {
		return bannerMapper.findById(id);
	}

}
