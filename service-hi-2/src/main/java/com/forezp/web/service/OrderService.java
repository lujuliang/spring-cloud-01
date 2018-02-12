package com.forezp.web.service;

import com.forezp.web.model.OrderModel;

/**
 * 
 * @author xujin
 *
 */
public interface OrderService {
	public OrderModel findOrderByOrderId(Long orderId);
}
