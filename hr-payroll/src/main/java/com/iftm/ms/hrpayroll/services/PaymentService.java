package com.iftm.ms.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.iftm.ms.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Alex", 200.0, days);
	}

}
