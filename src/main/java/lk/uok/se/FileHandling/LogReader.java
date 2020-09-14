package lk.uok.se.FileHandling;

import lk.uok.se.DTO.Message;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LogReader {
    private List<Message> messages=new ArrayList<Message>();
    private List<Message> errormessages=new ArrayList<Message>();

    public List<Message> logreader()
    {
        try{
            FileReader filereader=new FileReader("E:\\UniLectures\\SecondYear\\Software construction\\Assignment2\\LogAnalyzer\\src\\main\\resources\\idea.log");
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
