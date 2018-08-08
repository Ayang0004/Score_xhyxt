package com.xhyxt.service;

import java.util.List;

import com.xhyxt.pojo.BannerPicUp;

public interface BannerService {

	void addInfo(BannerPicUp bannerPicUp);

	List<BannerPicUp> queryPic(BannerPicUp bannerPicUp);

	void updatePic(BannerPicUp bannerPicUp);

	void showPic(BannerPicUp bannerPicUp);


	BannerPicUp findOne(String id);

	List<BannerPicUp> findAll();

	void picDelete(String[] ids);

	BannerPicUp findById(String id);

}
