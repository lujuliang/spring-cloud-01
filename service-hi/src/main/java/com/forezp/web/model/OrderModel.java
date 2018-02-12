package com.forezp.web.model;

import java.io.Serializable;
import java.util.Date;


public class OrderModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6323251729337776150L;
	public Long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	private Long orderNo;
	private Date createTime;
	private Date payTime;

}
