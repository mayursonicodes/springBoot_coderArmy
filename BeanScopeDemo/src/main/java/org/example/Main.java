package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order_1 = context.getBean(OrderService.class);
        System.out.println("order_1 executed");
        OrderService order_2 = context.getBean(OrderService.class);
        System.out.println("order_2 executed");

        System.out.println(order_1 == order_2);

        OrderService order_3 = new OrderService();

        User user_1 = context.getBean(User.class);
        User user_2 = context.getBean(User.class);

    }
}
