package com.bank.v1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.v1.bean.Customer;

public interface CustomerDao extends JpaRepository<Customer,Integer> {
	
}
