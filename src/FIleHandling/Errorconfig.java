package FIleHandling;

import java.util.*;

public class Errorconfig {
    List<Message> errormessages=new ArrayList<>();

    public List<Message> findingerrors(List<Message> messages)
    {
        for(Message message:messages)
        {
            if(message.type.equals("ERROR"))
            {
                errormessages.add(message);
            }
        }
        return errormessages;
    }
}
