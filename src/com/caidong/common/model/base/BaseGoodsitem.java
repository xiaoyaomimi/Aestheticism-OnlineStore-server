package com.caidong.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGoodsitem<M extends BaseGoodsitem<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setImgUrl(java.lang.String imgUrl) {
		set("imgUrl", imgUrl);
	}

	public java.lang.String getImgUrl() {
		return get("imgUrl");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setLevel(java.lang.Integer level) {
		set("level", level);
	}

	public java.lang.Integer getLevel() {
		return get("level");
	}

	public void setMonthSale(java.lang.Integer monthSale) {
		set("monthSale", monthSale);
	}

	public java.lang.Integer getMonthSale() {
		return get("monthSale");
	}

	public void setDescribe(java.lang.String describe) {
		set("describe", describe);
	}

	public java.lang.String getDescribe() {
		return get("describe");
	}

	public void setDeliveryType(java.lang.Integer deliveryType) {
		set("deliveryType", deliveryType);
	}

	public java.lang.Integer getDeliveryType() {
		return get("deliveryType");
	}

	public void setAverageTime(java.lang.String averageTime) {
		set("averageTime", averageTime);
	}

	public java.lang.String getAverageTime() {
		return get("averageTime");
	}

}
