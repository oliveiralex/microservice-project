package com.iftm.ms.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iftm.ms.hrpayroll.entities.Payment;
import com.iftm.ms.hrpayroll.entities.Worker;
import com.iftm.ms.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
				
		Worker obj = workerFeignClient.findById(workerId).getBody();
		return new Payment(obj.getName(), obj.getDailyIncome(), days);		
	}

}
