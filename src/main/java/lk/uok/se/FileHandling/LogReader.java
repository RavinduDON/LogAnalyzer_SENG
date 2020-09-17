package lk.uok.se.FileHandling;

import lk.uok.se.DTO.Message;

import java.io.FileReader;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

public class LogReader implements FileReaderRepo {
    private List<Message> messages=new ArrayList<Message>();

    public List<Message> logreader()
    {
        try{
            FileReader filereader=new FileReader("/home/charith/Desktop/git/src/main/resources/idea.log");
            Scanner scanner=new Scanner(filereader);
            while (scanner.hasNextLine())
            {
                String fullmessage=scanner.nextLine();
                StringTokenizer st=new StringTokenizer(fullmessage," ,[]");
                while(st.hasMoreTokens())
                {
                    Message message=new Message();
                    String str=st.nextToken()+st.nextToken();
                    SimpleDateFormat datetimeFormatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                    Date date= datetimeFormatter.parse(str);
                    Timestamp timestamp= new Timestamp(date.getTime());
                    message.setTimestamp(timestamp);
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
