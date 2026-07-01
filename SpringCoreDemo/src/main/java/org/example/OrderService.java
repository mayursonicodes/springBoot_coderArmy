package org.example;

import org.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    PaymentService paymentService;

//!    Use when we don't have multiple implementation of interface.
//!    @Autowired tells Spring: "Find a suitable bean from the Spring container and inject it here automatically."
//    @Autowired
//    OrderService(PaymentService paymentService){
//        this.paymentService = paymentService;
//    }

//!    Use when we have multiple implementation of interface and it is resolved by @Primary or @Qualifier.
//!    Use camelCase in @Qualifier("camelCase"). It should be same as class name.
    @Autowired
    OrderService(@Qualifier("upiPayment") PaymentService paymentService){
        this.paymentService = paymentService;
    }

//!    We can also use setter but constructor is recommended for most of the cases
//    @Autowired
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order placed");
    }
}