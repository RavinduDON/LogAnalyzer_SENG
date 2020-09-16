package lk.uok.se.FileHandling;

import lk.uok.se.DTO.Message;

import java.io.FileReader;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TimestampReader {

    List<Message> messages=new ArrayList<>();
    public List<Message> logreader()
    {
        try{
            FileReader filereader=new FileReader("/home/charith/Desktop/git2/git/src/main/resources/timestamp.txt");
            Scanner scanner=new Scanner(filereader);
            while (scanner.hasNextLine())
            {
                System.out.println(scanner.nextLine());
            }
            return messages;
        }catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
}
