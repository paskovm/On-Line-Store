package onlinestore.withlist.services;

import onlinestore.withlist.enteties.Order;

import java.util.List;

public interface OrderManagementService {

	void addOrder(Order order);

	List<Order> getOrdersByUserId(int userId);
	
	List<Order> getOrders();

}
