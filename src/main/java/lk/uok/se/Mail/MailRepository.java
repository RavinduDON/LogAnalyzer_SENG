package lk.uok.se.Mail;

import javax.mail.Message;
import javax.mail.Session;

public interface MailRepository {

    public void composeMail(String recipient, String errMsg) throws Exception;
    public Message prareMassage(Session session, String myEmail, String recipiant, String errMsg) throws Exception;

}
