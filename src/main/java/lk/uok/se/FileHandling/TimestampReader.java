package lk.uok.se.FileHandling;

import lk.uok.se.DTO.Message;

import java.io.FileReader;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

public class TimestampReader {
    SimpleDateFormat datetimeFormatter1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    Date last_error_date;
    Timestamp last_error_timestamp;

    public Timestamp timestampreader()
    {
        try{
            FileReader filereader=new FileReader("E:\\UniLectures\\SecondYear\\Software construction\\Assignment2\\Log_Analyzer\\src\\main\\resources\\timestamp.txt");
            Scanner scanner=new Scanner(filereader);
            last_error_date= datetimeFormatter1.parse(scanner.nextLine());
            last_error_timestamp= new Timestamp(last_error_date.getTime());
            return last_error_timestamp;
        }catch(Exception e)
        {
            return null;
        }
    }
}
