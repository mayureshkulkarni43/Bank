package com.bank.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.db.model.Customer;
import com.bank.db.repository.CustomerRepository;
import com.bank.db.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService custService;
	
	
	
	@GetMapping("/customerlist")
	public List<Customer> getCustomerList()
	{
		return custService.findAllCustomer();
	}
	
	@GetMapping("/customerlist/{uid}")
	public Customer getCustomerList(@PathVariable int uid)
	{
		return custService.findCustomerById(uid);
	}
	
	@PostMapping("/customer")
	public Customer putCustomer(@RequestBody Customer cust)
	{
		return custService.save(cust);
	}
}
