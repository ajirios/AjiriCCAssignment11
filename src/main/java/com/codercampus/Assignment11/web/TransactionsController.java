package com.codercampus.Assignment11.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codercampus.Assignment11.service.TransactionService;

@Controller
public class TransactionsController 

{
	@Autowired
	private TransactionService transactionService;
	
	@GetMapping("/transactions")
	public String getTransactions(ModelMap model)
	
	{
		model.put("transactions", transactionService.findAll());
		return "transactions";
	}
	
	@GetMapping("/transactions/{transactionID}")
	public String getTransaction(ModelMap model, @PathVariable Long transactionID)
	
	{
		model.put("transaction", transactionService.findById(transactionID));
		return "transactions";
	}

}
