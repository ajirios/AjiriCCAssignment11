package com.codercampus.Assignment11.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;

@Service
public class TransactionService 

{
	@Autowired
	private TransactionRepository transactionRepository;
	
	public Transaction findById(Long id)
	
	{
		for (Transaction transaction : transactionRepository.findAll())
			
		{
			if (transaction.getId().equals(id))
				
			{
				return transaction;
			}
		}
		
		return null;
	}
	
	public List<Transaction> findAll()
	
	{
		List<Transaction> transactions = transactionRepository.findAll();
		Collections.sort(transactions);
		return transactions;
	}

}
