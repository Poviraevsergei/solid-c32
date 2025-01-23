package org.tms.D.right;

public class User {
    private MessageService messageService;

    public User() {
        this.messageService = new EmailService();
    }
    
    public void notifyUser(String message){
        //другая логика
        messageService.sendMessage(message);
    }
}