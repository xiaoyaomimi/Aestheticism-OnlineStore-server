package com.caidong.common.controller;

import java.util.ArrayList;
import java.util.List;

import com.caidong.common.http.entity.request.LoginRequest;
import com.caidong.common.http.entity.response.LoginResponse;
import com.caidong.common.model.User;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class LoginController extends Controller {

	public void index() {
		render("index.html");
	}
	
	@ActionKey("/login")
	public void login() {
		User user = new User();
//		user.setUserName(getPara("userName"));
//		user.setPassword(getPara("password"));
//		User user = getModel(User.class);
		int i = User.me.userLogin(user);
//		List<LoginResponse> list = new ArrayList<LoginResponse>();
		if (i == 0) {
			LoginResponse rep = new LoginResponse();
			rep.setResponseCode("401");
			rep.setDetail("没有权限访问");
			renderJson(rep);
		} else {
			renderText("login Success!");
		}
//		list.add(rep);
//		list.add(rep);
//		renderJson("content",list);
//		renderJson(rep);
//		renderText("login Success!");
		
	}
	public void logout() {
		renderJson("");
	}
	
	
}
