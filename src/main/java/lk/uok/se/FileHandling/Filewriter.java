package lk.uok.se.FileHandling;

import lk.uok.se.DTO.Message;

import java.io.FileWriter;
import java.sql.Timestamp;
import java.util.List;

public class Filewriter implements FileWriterRepo {

    public void getaccesseto_file(List<Message> errormessages){
        try {
            TimestampReader timestampReader=new TimestampReader();
            Timestamp timestamp=timestampReader.timestampreader();
            FileWriter filewriter = new FileWriter("/home/charith/Desktop/LogAnalyzer_SENG-master/src/main/resources/timestamp.txt");

            //Print the last error date and time
            if(errormessages.isEmpty())
            {
                filewriter.write(timestamp.toString());
                filewriter.close();
            }
            else
            {
                filewriter.write(errormessages.get(errormessages.size()-1).getTimestamp().toString());
                filewriter.close();
            }

        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
