package lk.uok.se.Mail;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MailSender implements MailRepository{
    @Override
    public void composeMail(String recipient, String errMsg) throws Exception {
        Properties properties = new Properties();

        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","25");

        final String myEmail="seteamavc@gmail.com";
        final String password="123456789aA@";
        Session session=Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myEmail,password);
            }
        });
        Message message=prareMassage(session,myEmail,recipient,errMsg);

        Transport.send(message);
        System.out.println("Email Sent to "+recipient);
    }

    @Override
    public Message prareMassage(Session session, String myEmail, String recipiant, String errMsg) throws Exception {
        try {
            Message message=new MimeMessage(session);

            message.setFrom(new InternetAddress(myEmail));
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(recipiant));
            message.setSubject("NAITA Training Contract");
            message.setText("Your Training Contract has been registered with NAITA Colombo District office\n" +

                    "A copy of certified contract document can be obtained from NAITA Havelock Town Office\n" +
                    "Inquiries: 0112597672\n\n" +
                    "M.R.D.A.S Gunarathna\n" +
                    "District Manager\n" +
                    "NAITA-Colombo");
            return message;
        } catch (Exception e) {
            Logger.getLogger(MailSender.class.getName()).log(Level.SEVERE,null,e);
        }
        return null;
    }

}
