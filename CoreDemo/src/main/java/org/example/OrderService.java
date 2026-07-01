package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.example.notification.PopUpNotificationService;
import org.example.notification.SmsService;

public class OrderService {

//!    Tight coupling
    NotificationService notification_1 = new EmailService();
    NotificationService notification_2 = new SmsService();
    NotificationService notification_3 = new PopUpNotificationService();

    public void placeOrder(){
        System.out.println("Order placed");
        notification_1.sendNotification();
    }

//!    Dependency Injection
//    NotificationService notification_4;
//
//    public OrderService(NotificationService notification) {
//        this.notification_4 = notification;
//    }
//
////!    We can also use a setter to set the object
//
//    public void placeOrder(){
//        System.out.println("Order placed");
//        notification_4.sendNotification();
//    }

}