package com.sha.springbootmicroservice2purchase.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sha.springbootmicroservice2purchase.model.Purchase;
import com.sha.springbootmicroservice2purchase.repository.PurchaseRepo;

@Service
public class PurchaseServiceImpl implements PurchaseService 
{
	@Autowired
	private PurchaseRepo purchaseRepository;
	
	@Override
	public Purchase savePurchase(Purchase purchase) 
	{
		purchase.setPurchaseTime(LocalDateTime.now());
		return purchaseRepository.save(purchase);
	}
	
	@Override
	public List<Purchase> findAllPurchasesOfUser(Long userId)
	{
		return purchaseRepository.findAllByUserId(userId);
	}
}
