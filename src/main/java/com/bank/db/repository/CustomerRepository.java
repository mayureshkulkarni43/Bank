package com.bank.db.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.db.model.Customer;



@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	public Customer findByUid(int uid);
	
	

}
