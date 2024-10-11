package com.example.task;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "coupons")
public class Coupon {
    @Id
    private String id;
    public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Coupon [id=" + id + ", type=" + type + ", details=" + details + "]";
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public CouponDetails getDetails() {
		return details;
	}
	public void setDetails(CouponDetails details) {
		this.details = details;
	}
	private String type; // "cart-wise", "product-wise", "bxgy"
    private CouponDetails details;
	public Coupon(String id, String type, CouponDetails details) {
		super();
		this.id = id;
		this.type = type;
		this.details = details;
	}
}

@Data
class CouponDetails {
    public Double getThreshold() {
		return threshold;
	}
	public void setThreshold(Double threshold) {
		this.threshold = threshold;
	}
	@Override
	public String toString() {
		return "CouponDetails [threshold=" + threshold + ", discount=" + discount + ", productId=" + productId
				+ ", productDiscount=" + productDiscount + ", buyProducts=" + buyProducts + ", getProducts="
				+ getProducts + ", repetitionLimit=" + repetitionLimit + "]";
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Double getProductDiscount() {
		return productDiscount;
	}
	public void setProductDiscount(Double productDiscount) {
		this.productDiscount = productDiscount;
	}
	public List<ProductCondition> getBuyProducts() {
		return buyProducts;
	}
	public void setBuyProducts(List<ProductCondition> buyProducts) {
		this.buyProducts = buyProducts;
	}
	public List<ProductCondition> getGetProducts() {
		return getProducts;
	}
	public void setGetProducts(List<ProductCondition> getProducts) {
		this.getProducts = getProducts;
	}
	public int getRepetitionLimit() {
		return repetitionLimit;
	}
	public void setRepetitionLimit(int repetitionLimit) {
		this.repetitionLimit = repetitionLimit;
	}
	// For cart-wise coupons
    private Double threshold;  // Minimum cart value for discount
    public CouponDetails(Double threshold, Double discount, String productId, Double productDiscount,
			List<ProductCondition> buyProducts, List<ProductCondition> getProducts, int repetitionLimit) {
		super();
		this.threshold = threshold;
		this.discount = discount;
		this.productId = productId;
		this.productDiscount = productDiscount;
		this.buyProducts = buyProducts;
		this.getProducts = getProducts;
		this.repetitionLimit = repetitionLimit;
	}
	private Double discount;   // Percentage discount for cart-wise coupons

    // For product-wise coupons
    private String productId;
    private Double productDiscount; // Discount on specific products

    // For bxgy coupons
    private List<ProductCondition> buyProducts;  // Products required to buy
    private List<ProductCondition> getProducts;  // Products to get for free
    private int repetitionLimit;
}

@Data
class ProductCondition {
    private String productId;
    @Override
	public String toString() {
		return "ProductCondition [productId=" + productId + ", quantity=" + quantity + "]";
	}
	public ProductCondition(String productId, int quantity) {
		super();
		this.productId = productId;
		this.quantity = quantity;
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
	private int quantity;
}

