package com.bank.db.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.db.model.Account;
import com.bank.db.model.Customer;



@Repository
public interface AccountRepository extends JpaRepository<Account, String>{
	
	public Account findByUid(int id);
	
	
	//status 
	
	public List<Account> findByReason(String reason);
	
	public Account findByAccountno(int accno);
	

}
