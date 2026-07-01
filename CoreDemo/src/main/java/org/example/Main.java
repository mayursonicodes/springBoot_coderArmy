package org.example;

import org.example.notification.NotificationService;
import org.example.notification.PopUpNotificationService;

public class Main {
    static void main() {

//!        Tight coupling
        OrderService order_1 = new OrderService();
        order_1.placeOrder();

//!        Dependency Injection
//        NotificationService notification_1 = new PopUpNotificationService();
//        OrderService order_2 = new OrderService(notification_1);
//        order_2.placeOrder();


    }
}