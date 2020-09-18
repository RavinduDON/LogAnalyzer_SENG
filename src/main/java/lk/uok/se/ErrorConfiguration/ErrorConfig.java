package lk.uok.se.ErrorConfiguration;

import lk.uok.se.DTO.Message;
import lk.uok.se.FileHandling.TimestampReader;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ErrorConfig implements ErrorConfigRepo{
    private List<Message> errormessages=new ArrayList<Message>();


    @Override
    public List<Message> findingerrors(List<Message> messages)
    {
        TimestampReader timestampReader=new TimestampReader();
        Timestamp timestamp=timestampReader.timestampreader();
        System.out.println(timestamp);

        for(Message message:messages)
        {
            if(message.getType().equals("ERROR"))
            {
                if(message.getTimestamp().after(timestamp))
                {
                    errormessages.add(message);
                }
            }
        }
        return errormessages;
    }
}
