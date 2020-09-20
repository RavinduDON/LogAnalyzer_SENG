package lk.uok.se.Mail;

import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class MailSenderTest {
    @Test
    public void When_Email_Address_is_Null() {
        String address="";
        MailSender sender=new MailSender();

    }
    @Test
    public void When_Email_Address_is_invalid(){
        ArrayList<String> sender=new ArrayList<String>();

        ArrayList<String> sender2=new ArrayList<String>();

        assertArrayEquals(sender2.toArray(),sender.toArray());

    }
}