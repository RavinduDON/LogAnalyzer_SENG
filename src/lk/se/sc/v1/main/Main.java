package lk.se.sc.v1.main;

import java.util.List;

import lk.se.sc.v1.FIleHandling.Errorconfig;
import lk.se.sc.v1.FIleHandling.LogReader;
import lk.se.sc.v1.DTO.Message;

public class Main {

    public static void main(String[] args) {

        //Reading the file and Creating a List of Messages
        LogReader logreader=new LogReader();
        List<Message> messages=logreader.logreader();
        for (Message message:messages
        ) {
            System.out.println(message.getDetail());
        }

        //Sorting out Error Messages
        Errorconfig errorconfig=new Errorconfig();
        List<Message> errormessages=errorconfig.findingerrors(messages);
    }
}

