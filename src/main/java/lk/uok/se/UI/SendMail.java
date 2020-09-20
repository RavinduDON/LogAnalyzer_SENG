package lk.uok.se.Mail;

import lk.uok.se.DBManagement.DBFactory;
import lk.uok.se.DBManagement.DBRepository;
import lk.uok.se.DTO.Email;
import lk.uok.se.DTO.Message;
import lk.uok.se.ErrorConfiguration.ErrorConfig;
import lk.uok.se.FileHandling.Filewriter;
import lk.uok.se.FileHandling.LogReader;

import java.util.List;

public class SendMail {

    DBRepository dbRepository;




    public SendMail() {
        dbRepository= DBFactory.getDbFactory().getDBrepository(DBFactory.DBFactoryTypes.email);
    }

    public void sendErrMail() throws Exception {
        MailSender mailSender=new MailSender();
        LogReader logReader=new LogReader();
        ErrorConfig errorConfig=new ErrorConfig();
        StringBuilder builder=new StringBuilder("");
        List<Email> emailList=dbRepository.getAll();
        List<Message> messages=logReader.logreader();
        List<Message> errormessages=errorConfig.findingerrors(messages);
        for (Message message:errormessages
             ) {
            builder.append(message.getTimestamp()+" "+message.getDetail()+"\n");
        }
        System.out.println(builder);
        int mailsiz=emailList.size();
        int errcnt=errormessages.size();

        for (int i=0;i<mailsiz;i++){
            Email mail=emailList.get(i);
            String address=mail.getAddress();
            mailSender.composeMail(address,builder.toString());
        }
        Filewriter filewriter=new Filewriter();
        filewriter.getaccesseto_file(errormessages);




    }
}
