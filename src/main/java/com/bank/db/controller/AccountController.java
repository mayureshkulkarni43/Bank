package com.bank.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.db.model.Account;
import com.bank.db.service.AccountService;

@RestController
@RequestMapping(value="/account")
public class AccountController {
	
	@Autowired
	AccountService accService; 
	
	@GetMapping("/listaccounts")
	public List<Account> getListOfAccount(){
		
		return accService.findAllCustomerOfBank();
	}
	
	
	@GetMapping("/accountbyUID")
public Account getAccountByUID(@RequestParam int id){
		System.out.print("******"+id);
		return accService.findCustomerByUID(id);
	}
	
	
	@GetMapping("/accountno")
public Account getAccountByAccountNo(@RequestParam int id){
		System.out.print(id);
		return accService.findCustomerByAccountNo(id);
	}
	
	
	@PostMapping("/save")
public Account getAccountByAccountNo(@RequestBody Account account){
		
		return accService.save(account);
	}

}
