package com.PaymentService.paymentservice.services;

import com.PaymentService.paymentservice.paymentgateway.PaymentGateway;
import com.razorpay.RazorpayException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private PaymentGateway paymentGateway;
    public PaymentService(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }
    public String initiatePayment(String orderId, Long amount, String phoneNumber, String email) throws RazorpayException {
        return paymentGateway.generatePaymentLink(orderId,amount,phoneNumber,email);
    }
}
