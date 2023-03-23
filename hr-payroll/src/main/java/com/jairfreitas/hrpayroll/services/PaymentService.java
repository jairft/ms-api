package com.jairfreitas.hrpayroll.services;

import com.jairfreitas.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days){
        return new Payment("jair", 250.0, days);
    }
}
