package lk.uok.v1;

import lk.uok.v1.FIleHandling.Errorconfig;
import lk.uok.v1.FIleHandling.Logreader;
import lk.uok.v1.FIleHandling.Message;
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

