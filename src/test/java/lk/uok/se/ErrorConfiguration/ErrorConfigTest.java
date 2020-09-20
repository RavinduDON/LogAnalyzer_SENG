package lk.uok.se.ErrorConfiguration;

import lk.uok.se.DTO.Message;
import lk.uok.se.FileHandling.LogReader;
import lk.uok.se.FileHandling.TimestampReader;
import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class ErrorConfigTest {
    @Test
    public void Should_return_error_messages_if_there_is_an_error() throws ParseException {

        LogReader logReader=mock(LogReader.class);
        TimestampReader timestampReader=mock(TimestampReader.class);
        Timestamp timestamp=timestampReader.timestampreader();
        Message message=mock(Message.class);
        List<Message> messageList=new ArrayList<>();
        String str="2020-01-28 16:16:51.0";
        SimpleDateFormat datetimeFormatter = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
        Date date= datetimeFormatter.parse(str);
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
        str="2020-01-28 16:16:51.0";
        datetimeFormatter = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
        date= datetimeFormatter.parse(str);
        timestamp= new Timestamp(date.getTime());
        message.setTimestamp(timestamp);
        message.setDetail("j.psi.stubs.StubTreeLoaderImpl - Outdated stub in index: file://C:/Users/This PC/OneDrive/Desktop/projects/University_Management_System/");
        messageList.add(message);

        messageList=logReader.logreader();
        ErrorConfig config=new ErrorConfig();
        config.findingerrors(messageList);





    }
}