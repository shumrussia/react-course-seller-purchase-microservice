package com.sha.springbootmicroservice2purchase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sha.springbootmicroservice2purchase.model.Purchase;

public interface PurchaseRepo extends JpaRepository<Purchase, Long> 
{
	List<Purchase> findAllByUserId(Long userId);
}
