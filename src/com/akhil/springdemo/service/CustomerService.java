package com.akhil.springdemo.service;
import java.util.*;

import com.akhil.springdemo.entity.Customer;
public interface CustomerService {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int id);

	public void deleteCustomer(int id);
}
