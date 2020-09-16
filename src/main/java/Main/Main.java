package Main;

import lk.uok.se.DTO.Message;
import lk.uok.se.FileHandling.ErrorConfig;
import lk.uok.se.FileHandling.Filewriter;
import lk.uok.se.FileHandling.LogReader;
import lk.uok.se.FileHandling.TimestampReader;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        LogReader logReader=new LogReader();
        List<Message> messages=logReader.logreader();

        ErrorConfig errorConfig=new ErrorConfig();
        List<Message> errormessages=errorConfig.findingerrors();

        Filewriter filewriter=new Filewriter();
        filewriter.getaccesseto_file(errormessages);

        TimestampReader timestampReader=new TimestampReader();
        timestampReader.logreader();
    }
}
