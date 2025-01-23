package org.tms.D.right;

public class TelegramService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message to telegram: " + message);
        System.out.println(message);
        System.out.println("Done");
    }
}
