package org.tms.pattern.adapter;

public class Adapter extends TelegramLogic implements NotificationService {
    
    @Override
    public void send(String message) {
        //находим username
        String username = "usernameexample";
        sendMessageToTelegramUser(username, "Hello adapter");
    }
}

/*public class Adapter implements NotificationService {
    TelegramLogic telegramLogic = new TelegramLogic();

    @Override
    public void send(String message) {
        //находим username
        String username = "usernameexample";
        telegramLogic.sendMessageToTelegramUser(username, "Hello adapter");
    }
}*/
