package lk.uok.se.FileHandling;

import lk.uok.se.DTO.Message;

import java.io.FileWriter;
import java.util.List;

public class Filewriter {

    public void getaccesseto_file(List<Message> errormessages){
        try {
            FileWriter filewriter = new FileWriter("/home/charith/Desktop/git2/git/src/main/resources/timestamp.txt");

            //Print the last line
            filewriter.write(errormessages.get(errormessages.size()-1).getDate()+","+errormessages.get(errormessages.size()-1).getTime());
            filewriter.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
