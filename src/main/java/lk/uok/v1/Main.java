package lk.uok.v1;

import FIleHandling.Errorconfig;
import FIleHandling.Logreader;
import FIleHandling.Message;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Reading the file and Creating a List of Messages
        Logreader logreader=new Logreader();
        List<Message> messages=logreader.logreader();

        //Sorting out Error Messages
        Errorconfig errorconfig=new Errorconfig();
        List<Message> errormessages=errorconfig.findingerrors(messages);
    }
}

