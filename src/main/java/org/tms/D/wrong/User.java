package org.tms.D.wrong;

public class User {
  //  private EmailService emailService;
    private EmailService emailService;

    public User() {
        this.emailService = new EmailService();
    }
    
    public void notifyUser(String message){
        //другая логика
        emailService.sendEmail(message);
    }

    public void notifyUser1(String message){
        //другая логика
        emailService.sendEmail(message);
    }

    public void notifyUsern(String message){
        //другая логика
        emailService.sendEmail(message);
    }
    
}
