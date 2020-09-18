package lk.uok.se.Main;

import lk.uok.se.DTO.Message;
import lk.uok.se.ErrorConfiguration.ErrorConfig;
import lk.uok.se.FileHandling.Filewriter;
import lk.uok.se.FileHandling.LogReader;
import lk.uok.se.FileHandling.TimestampReader;

import java.sql.Timestamp;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        LogReader logReader=new LogReader();
        List<Message> messages=logReader.logreader();

//        for(Message message:messages)
//        {
//            System.out.println(message.getTimestamp()+","+message.getDetail());
//        }

        ErrorConfig errorConfig=new ErrorConfig();
        List<Message> errormessages=errorConfig.findingerrors(messages);

        for(Message message:errormessages)
        {
            System.out.println(message.getTimestamp()+","+message.getDetail());
        }

        Filewriter filewriter=new Filewriter();
        filewriter.getaccesseto_file(errormessages);


    }
}
