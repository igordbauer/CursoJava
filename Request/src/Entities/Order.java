package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entities.enums.OrderStatus;

public class Order {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	
	private Date moment;
	private OrderStatus orderStatus;
	private Client client;

	private List<OrderItem> items = new ArrayList<>();

	public Order(Date moment, OrderStatus orderStatus, Client client) {

		this.moment = moment;
		this.orderStatus = orderStatus;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double total() {
		Double total = 0.0;
		for (OrderItem c : items) {
			total += c.subTotal();
		}
		return total;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment:");
		sb.append(sdf.format(moment) + "\n" );
		sb.append("Order status:");
		sb.append(orderStatus + "\n");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for(OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total Price: \n");
		sb.append(String.format("%.2f",total()));
		return sb.toString();
		}
}
