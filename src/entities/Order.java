package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entitiesEnums.OrderStatus;

public class Order {
	private Date momento;
	private OrderStatus status;
	
	private Clients client;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	
	List<OrderItem> itens = new ArrayList<>();

	public Order(Date momento, OrderStatus status, Clients client) {
		this.momento = momento;
		this.status = status;
		this.client = client;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	public List<OrderItem> getItem() {
		return itens;
	}
	
	public void addItem(OrderItem item) {
		itens.add(item);
	}
	
	public void removeItem(OrderItem item) {
		itens.remove(item);
	}
	
	public Double total() {
		double sum = 0.0;
		for(OrderItem obj : itens) {
			sum += obj.subTotal();
		}
		return sum;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: " + sdf.format(momento)+ "\n");
		sb.append("Status do pedido: " + status + "\n");
		sb.append("Cliente: " + client + "\n");
		sb.append("Itens de ordem:\n");
		for(OrderItem item : itens) {
			sb.append(item + "\n");
		}
		sb.append("----------------------------------------------\n");
		sb.append("Preço Total: R$" + String.format("%.2f", total()));
		return sb.toString();
	}
}
