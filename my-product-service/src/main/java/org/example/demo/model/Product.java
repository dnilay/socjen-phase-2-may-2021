package org.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@Column(name = "id")
	private Integer productId;
	@Column(name = "name")
	private String productName;
	
	public Product() {
		super();
	}


	public Product(Integer productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}


	public Integer getProductId() {
		return productId;
	}


	public void setProductId(Integer productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	
	

}
