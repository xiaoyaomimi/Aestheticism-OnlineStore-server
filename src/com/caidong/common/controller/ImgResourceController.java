package com.caidong.common.controller;

import java.util.ArrayList;
import java.util.List;

import com.caidong.common.model.Goodsitem;
import com.caidong.common.model.Homeimg;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class ImgResourceController extends Controller {
	@ActionKey("/homeImg")
	public void getHomeImg() {
		List<Homeimg> imgList = new ArrayList<Homeimg>();
		Homeimg img1 = new Homeimg();
		img1.setPath("http://172.16.193.74:8080/Aestheticism/home_img/Koala.jpg");
		img1.setVcode("s01");
		Homeimg img2 = new Homeimg();
		img2.setPath("http://172.16.193.74:8080/Aestheticism/home_img/Lighthouse.jpg");
		img2.setVcode("s01");
		Homeimg img3 = new Homeimg();
		img3.setPath("http://172.16.193.74:8080/Aestheticism/home_img/Penguins.jpg");
		img3.setVcode("s01");
		Homeimg img4 = new Homeimg();
		img4.setPath("http://172.16.193.74:8080/Aestheticism/home_img/Tulips.jpg");
		img4.setVcode("s01");
		imgList.add(img1);
		imgList.add(img2);
		imgList.add(img3);
//		imgList.add(img4);
		renderJson(imgList);
	}
	@ActionKey("/homeGoodsList")
	public void getGoodsItems() {
		List<Goodsitem> list = new ArrayList<Goodsitem>();
		Goodsitem item = new Goodsitem();
		item.setImgUrl("http://172.16.193.74:8080/Aestheticism/goods_img/goods_item.png");
		item.setName("有一家商店");
		item.setLevel(0);
		item.setMonthSale(2000);
		item.setDescribe("50元起送");
		item.setDeliveryType(0);
		item.setAverageTime("20分钟");
		list.add(item);
		list.add(item);
		renderJson(list);
	}
}
