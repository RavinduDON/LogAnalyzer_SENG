package Main;

import lk.uok.se.DTO.Message;
import lk.uok.se.FileHandling.ErrorConfig;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        ErrorConfig config=new ErrorConfig();
        List<Message> messageList=config.findingerrors();
        for (Message message :messageList
                ) {
            System.out.println(message.getDetail());
            System.out.println(message.getTime()+" "+message.getDate());
        }

    }
}
