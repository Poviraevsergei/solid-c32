package org.tms.D.right;

public class EmailService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email.....");
        System.out.println(message);
        System.out.println("Done");
    }
}
