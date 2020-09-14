package lk.uok.se.FileHandling;

import lk.uok.se.DTO.Message;

import java.io.FileWriter;
import java.util.List;

public class Filewriter {
    public void getaccesseto_file(List<Message> errormessages){
        try {
            FileWriter filewriter = new FileWriter("/home/charith/Desktop/git/src/main/resources/timestamp.txt");
            for(Message message:errormessages)
            {
                filewriter.write(message.getDate()+","+message.getTime()+"\n");
            }
            filewriter.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
