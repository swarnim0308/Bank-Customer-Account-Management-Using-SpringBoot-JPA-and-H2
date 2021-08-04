package com.bank.v1.service;

import java.util.List;

import com.bank.v1.bean.Customer;

public interface CustomerService {
	public Customer save(Customer d);   
	public Customer findById(Integer id);   
	public Customer update(Customer d);   
	public String deleteById(Integer id);  
	public List<Customer> findAll();
}
