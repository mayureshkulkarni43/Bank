package com.bank.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.db.model.Customer;
import com.bank.db.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository custRepo;

	public	List<Customer> findAllCustomer() {
	return custRepo.findAll();
}
	
	public Customer findCustomerById(int id) {
		
		return custRepo.findByUid(id);
	}

	public Customer  save(Customer cust) {
		return custRepo.save(cust);
		
	}

}
