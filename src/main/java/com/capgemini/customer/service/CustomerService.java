package com.capgemini.customer.service;

import java.util.List;

import com.capgemini.customer.entity.Customer;

public interface CustomerService {
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer getCustomerById(long customerId);
	public void delete(Customer customer);
}
