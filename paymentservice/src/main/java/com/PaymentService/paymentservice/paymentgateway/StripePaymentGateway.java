package com.PaymentService.paymentservice.paymentgateway;

import com.razorpay.RazorpayException;

public class StripePaymentGateway implements PaymentGateway{

    @Override
    public String generatePaymentLink(String orderId, Long amount, String phoneNumber, String email) throws RazorpayException {
        return "";
    }
}
