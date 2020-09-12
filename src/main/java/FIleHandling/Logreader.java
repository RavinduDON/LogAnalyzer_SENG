package FIleHandling;

import java.io.*;
import java.util.*;

public class Logreader {
    List<Message> messages=new ArrayList<Message>();
    List<Message> errormessages=new ArrayList<Message>();

    public List<Message> logreader()
    {
        try{
            FileReader filereader=new FileReader("/home/charith/Documents/idea.log");
            Scanner scanner=new Scanner(filereader);
            while (scanner.hasNextLine())
            {
                String fullmessage=scanner.nextLine();
                StringTokenizer st=new StringTokenizer(fullmessage," ,[]");

                while(st.hasMoreTokens())
                {
                    Message message=new Message();
                    message.setDate(st.nextToken());
                    message.setTime(st.nextToken());
                    st.nextToken();
                    st.nextToken();
                    message.setType(st.nextToken());
                    st.nextToken();
                    message.setDetail("");
                    while(st.hasMoreTokens())
                    {
                        message.setDetail(message.getDetail()+st.nextToken());
                    }
                    messages.add(message);
                }
            }
            return messages;
        }catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
}
