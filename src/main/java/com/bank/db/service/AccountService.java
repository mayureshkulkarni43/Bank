package com.bank.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.db.model.Account;
import com.bank.db.model.Customer;
import com.bank.db.repository.AccountRepository;
import com.bank.db.repository.CustomerRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepo;

	public	List<Account> findAllCustomerOfBank() {
	return accountRepo.findAll();
}
	
	public Account findCustomerByAccountNo(int id) {
		
		return accountRepo.findByAccountno(id);
	}
	
	
public Account findCustomerByUID(int id) {
		
		return accountRepo.findByUid(id);
	}

	public Account  save(Account cust) {
		return accountRepo.save(cust);
		
	}

}
