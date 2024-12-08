package com.PaymentService.paymentservice.paymentgateway;

import com.razorpay.RazorpayException;

public interface PaymentGateway {
    public String generatePaymentLink(String orderId,Long amount,String phoneNumber,String email) throws RazorpayException;

}
