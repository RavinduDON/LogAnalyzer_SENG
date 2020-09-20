package lk.uok.se.UI;

import lk.uok.se.DBManagement.DBPerformAction;
import lk.uok.se.DTO.Email;
import lk.uok.se.DTO.Message;
import lk.uok.se.ErrorConfiguration.ErrorConfig;
import lk.uok.se.FileHandling.LogReader;
import lk.uok.se.Mail.MailSender;
import org.junit.Test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class SendMailTest {

    @Test
    public void Should_Send_Email_From_ErrorConfig() throws Exception {
        MailSender mailSender=mock(MailSender.class);
        LogReader logReader=mock(LogReader.class);
        ErrorConfig errorConfig=mock(ErrorConfig.class);
        DBPerformAction dbPerformAction=mock(DBPerformAction.class);
        Email email=mock(Email.class);
        Message message=mock(Message.class);


        List<Email> emailList=new ArrayList<>();
        List<Message> messageList=new ArrayList<>();

        email.setAddress("bimalicw@gmail.com");
        emailList.add(email);
        email.setAddress("charithniroshan44@gmail.com");
        emailList.add(email);
        email.setAddress("chathurikadhananjani97@gmail.com");
        emailList.add(email);
        email.setAddress("ravindugunarathna@gmail.com");
        emailList.add(email);
        email.setAddress("w.c.s.desilva@gmail.com");
        emailList.add(email);
        String str="2020-01-28 16:16:51.0";
        SimpleDateFormat datetimeFormatter = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
        Date date= datetimeFormatter.parse(str);
        Timestamp timestamp= new Timestamp(date.getTime());
        message.setTimestamp(timestamp);
        message.setDetail("j.psi.stubs.StubTreeLoaderImpl - Outdated stub in index: file://C:/Users/This PC/OneDrive/Desktop/projects/University_Management_System/");
        messageList.add(message);
         str="2020-01-28 16:16:51.0";
         datetimeFormatter = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
         date= datetimeFormatter.parse(str);
         timestamp= new Timestamp(date.getTime());
        message.setTimestamp(timestamp);
        message.setDetail("j.psi.stubs.StubTreeLoaderImpl - Outdated stub in index: file://C:/Users/This PC/OneDrive/Desktop/projects/University_Management_System/");
        messageList.add(message);
         str="2020-01-28 16:16:51.0";
         datetimeFormatter = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
         date= datetimeFormatter.parse(str);
         timestamp= new Timestamp(date.getTime());
        message.setTimestamp(timestamp);
        message.setDetail("j.psi.stubs.StubTreeLoaderImpl - Outdated stub in index: file://C:/Users/This PC/OneDrive/Desktop/projects/University_Management_System/");
        messageList.add(message);
        str="2020-01-28 16:16:51.0";
        datetimeFormatter = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
        date= datetimeFormatter.parse(str);
        timestamp= new Timestamp(date.getTime());
        message.setTimestamp(timestamp);
        message.setDetail("j.psi.stubs.StubTreeLoaderImpl - Outdated stub in index: file://C:/Users/This PC/OneDrive/Desktop/projects/University_Management_System/");
        messageList.add(message);
        str="2020-01-28 16:16:51.0";
        datetimeFormatter = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
        date= datetimeFormatter.parse(str);
        timestamp= new Timestamp(date.getTime());
        message.setTimestamp(timestamp);
        message.setDetail("j.psi.stubs.StubTreeLoaderImpl - Outdated stub in index: file://C:/Users/This PC/OneDrive/Desktop/projects/University_Management_System/");
        messageList.add(message);
        str="2020-01-28 16:16:51.0";
        datetimeFormatter = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
        date= datetimeFormatter.parse(str);
        timestamp= new Timestamp(date.getTime());
        message.setTimestamp(timestamp);
        message.setDetail("j.psi.stubs.StubTreeLoaderImpl - Outdated stub in index: file://C:/Users/This PC/OneDrive/Desktop/projects/University_Management_System/");
        messageList.add(message);

        when(logReader.logreader()).thenReturn(messageList);

        SendMail sendMail=new SendMail();
        sendMail.sendErrMail();



    }
}