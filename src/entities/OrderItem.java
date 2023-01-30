package entities;

public class OrderItem {
	private Double price;
	private Integer quantity;
	private Produtos prod;
	
	
	public OrderItem(Double price, Integer quantity, Produtos prod) {
		this.price = price;
		this.quantity = quantity;
		this.prod = prod;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Produtos getProd() {
		return prod;
	}


	public void setProd(Produtos prod) {
		this.prod = prod;
	}
	
	public Double subTotal() {
		return price * quantity;
	}
	
	public String toString() {
		return prod.getNome() + ", R$" + String.format("%.2f", price) + ", Quantidade: " + 
	quantity + ", Subtotal: R$" + String.format("%.2f",subTotal());
	}
}
