package org.tms.pattern.adapter;

public class SmsNotificationImpl implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Sending SMS message: " + message);
    }
}
