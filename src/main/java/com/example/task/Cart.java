package com.example.task;


import lombok.Data;

import java.util.List;

@Data
public class Cart {
    public List<CartItem> getItems() {
		return items;
	}

	public void setItems(List<CartItem> items) {
		this.items = items;
	}

	public Cart(List<CartItem> items) {
		super();
		this.items = items;
	}

	@Override
	public String toString() {
		return "Cart [items=" + items + "]";
	}

	private List<CartItem> items;
	public Cart() {
    }
}

@Data
class CartItem {
    public CartItem(String productId, int quantity, double price) {
		super();
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public String toString() {
		return "CartItem [productId=" + productId + ", quantity=" + quantity + ", price=" + price + "]";
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private String productId;
    private int quantity;
    private double price;
    public CartItem() {
    }
}

