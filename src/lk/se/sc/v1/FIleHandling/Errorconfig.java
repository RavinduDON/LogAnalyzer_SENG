package lk.se.sc.v1.FIleHandling;

import lk.se.sc.v1.DTO.Message;

import java.util.*;

public class Errorconfig {
    List<Message> errormessages=new ArrayList<>();

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
