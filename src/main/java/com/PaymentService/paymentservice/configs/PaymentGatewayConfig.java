package com.PaymentService.paymentservice.configs;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentGatewayConfig {
    @Value("${razorpay.key.id}")
    private String razorpayId;
    @Value("${razorpay.key.secrkey.id}")
    private String razorpaySecretId;

    @Bean
    public RazorpayClient razorpayClient() throws RazorpayException {
        return new RazorpayClient(razorpayId, razorpaySecretId);
    }
}
