package com.bank.v1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bank.v1.bean.Transactions;

public interface TransactionDao extends JpaRepository<Transactions,Integer> {

}
