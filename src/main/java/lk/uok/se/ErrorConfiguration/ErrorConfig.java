package lk.uok.se.ErrorConfiguration;

import lk.uok.se.DTO.Message;
import lk.uok.se.FileHandling.TimestampReader;

import java.util.ArrayList;
import java.util.List;

public class ErrorConfig implements ErrorConfigRepo{
    private List<Message> errormessages=new ArrayList<Message>();

    TimestampReader timestampReader=new TimestampReader();

    @Override
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
