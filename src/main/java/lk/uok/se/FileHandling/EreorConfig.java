package lk.uok.se.FileHandling;

import lk.uok.se.DTO.Message;

import java.util.ArrayList;
import java.util.List;

public class EreorConfig {
    List<Message> errormessages=new ArrayList<Message>();

    public List<Message> findingerrors(List<Message> messages)
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
