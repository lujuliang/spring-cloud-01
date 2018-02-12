package com.forezp.web.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.forezp.web.model.OrderModel;
import com.forezp.web.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	public OrderModel findOrderByOrderId(Long orderId) {
		OrderModel orderModel = new OrderModel();
		if (orderId.equals(2L)) {

			orderModel.setCreateTime(new Date());
			orderModel.setOrderNo(2L);
			orderModel.setPayTime(new Date());
		}
		return orderModel;
	}

}
