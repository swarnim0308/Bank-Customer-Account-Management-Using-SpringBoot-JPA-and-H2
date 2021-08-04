package com.bank.v1.service;

import com.bank.v1.bean.Customer;

public interface TransactionService {
	public String sendMoney(int fromId, int toId, int amount); 
}
