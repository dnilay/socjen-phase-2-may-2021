package org.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	private String customerId;
	private String customerName;
	@Autowired
	private Address address;
	public Customer(String customerId, String customerName, Address address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
	}
	public Customer() {
		super();
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address + "]";
	}

}
