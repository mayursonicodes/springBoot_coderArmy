package org.example;

import org.example.payment.CardPayment;
import org.example.payment.PaymentService;
import org.example.payment.UpiPayment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {

//!        Old Dependency Injection
//        PaymentService paymentService = new UpiPayment();
//        OrderService order = new OrderService(paymentService);
//        order.placeOrder();

//!        IOC (Inversion of Control) container created for storing the beans(objects) in it.
//!        AppConfig is it's configuration file
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();

        User user = context.getBean(User.class);
        System.out.println(user.getName());
        System.out.println(user.getAge());

    }
}