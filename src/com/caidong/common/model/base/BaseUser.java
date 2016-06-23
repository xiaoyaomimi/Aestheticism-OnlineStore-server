package com.caidong.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setUserName(java.lang.String userName) {
		set("user_name", userName);
	}

	public java.lang.String getUserName() {
		return get("user_name");
	}

	public void setPassword(java.lang.String password) {
		set("password", password);
	}

	public java.lang.String getPassword() {
		return get("password");
	}

	public void setGender(java.lang.Integer gender) {
		set("gender", gender);
	}

	public java.lang.Integer getGender() {
		return get("gender");
	}

	public void setPhoneNumber(java.lang.String phoneNumber) {
		set("phone_number", phoneNumber);
	}

	public java.lang.String getPhoneNumber() {
		return get("phone_number");
	}

	public void setTrueName(java.lang.String trueName) {
		set("true_name", trueName);
	}

	public java.lang.String getTrueName() {
		return get("true_name");
	}

	public void setIdCard(java.lang.String idCard) {
		set("id_card", idCard);
	}

	public java.lang.String getIdCard() {
		return get("id_card");
	}

	public void setCreateTime(java.lang.String createTime) {
		set("create_time", createTime);
	}

	public java.lang.String getCreateTime() {
		return get("create_time");
	}

	public void setUpdateTime(java.lang.String updateTime) {
		set("update_time", updateTime);
	}

	public java.lang.String getUpdateTime() {
		return get("update_time");
	}

	public void setLastLoginTime(java.lang.String lastLoginTime) {
		set("last_login_time", lastLoginTime);
	}

	public java.lang.String getLastLoginTime() {
		return get("last_login_time");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}

	public java.lang.Integer getStatus() {
		return get("status");
	}

}
