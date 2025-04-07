package gesc.mail;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class ServiceMail extends JavaMailSenderImpl{
    private final JavaMailSender javaMailSender ;



    public void sendSimpleMail(String to , String from , String Subject , String body){
        SimpleMailMessage message = new SimpleMailMessage() ;
        message.setTo(to);
        message.setFrom(from);
        message.setFrom(from);
        message.setText(body);
        this.javaMailSender.send(message);

    }

    public ServiceMail( ) {
        this.javaMailSender =  new JavaMailSenderImpl();

    }
}
