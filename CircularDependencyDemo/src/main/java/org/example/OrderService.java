package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private PaymentService paymentService;

//!    Here, OrderService requires PaymentService and In PaymentService, PaymentService requires OrderService. Hence, Circular Dependency is created and our program got stuck.
//!    It can be resolved by using field injection or setter injection because these don't require another object at the time of their own object creation just like constructor injection.
//!    It can also be resolved by using @Lazy annotation, and we will learn it in the future.
//!    But it is always preferred to design a such code where this Circular Dependency condition does not occur.
    @Autowired
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        System.out.println("Order Placed.");
        paymentService.pay();
    }

    public void getOrderDetails(){
        System.out.println("Order details are ....");
    }
}