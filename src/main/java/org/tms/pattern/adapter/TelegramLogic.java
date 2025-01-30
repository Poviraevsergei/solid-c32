package org.tms.pattern.adapter;

public class TelegramLogic {
    void sendMessageToTelegramUser(String username, String message) {
        System.out.println("Sending telegram message to user: " + username);
        System.out.println("Message: " + message);
    }
}
