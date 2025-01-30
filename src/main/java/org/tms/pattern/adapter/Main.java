package org.tms.pattern.adapter;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new Adapter();
        notificationService.send("hello students");
    }
}
