package lk.uok.se.FileHandling;

import lk.uok.se.DTO.Message;

import java.util.ArrayList;
import java.util.List;

public class ErrorConfig {
    private LogReader reader=new LogReader();
    private List<Message> messages= reader.logreader();
    private List<Message> errormessages=new ArrayList<Message>();

    public List<Message> findingerrors()
    {
        for(Message message:messages)
        {
            if(message.getType().equals("ERROR"))
            {
                errormessages.add(message);
            }
        }
        return errormessages;
    }
}
