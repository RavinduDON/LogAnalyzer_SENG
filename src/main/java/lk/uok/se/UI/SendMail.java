package lk.uok.se.UI;

import lk.uok.se.DBManagement.DBFactory;
import lk.uok.se.DBManagement.DBRepository;
import lk.uok.se.DTO.Email;
import lk.uok.se.DTO.Message;
import lk.uok.se.ErrorConfiguration.ErrorConfig;
import lk.uok.se.FileHandling.Filewriter;
import lk.uok.se.FileHandling.LogReader;
import lk.uok.se.Mail.MailSender;

import java.util.List;

public class SendMail {

    DBRepository dbRepository;

    private MailSender mailSender=new MailSender();
    private LogReader logReader=new LogReader();
    private ErrorConfig errorConfig=new ErrorConfig();



    public SendMail() {
        dbRepository= DBFactory.getDbFactory().getDBrepository(DBFactory.DBFactoryTypes.email);
    }

    public SendMail(MailSender mailSender, LogReader logReader, ErrorConfig errorConfig) {
        this.mailSender = mailSender;
        this.logReader = logReader;
        this.errorConfig = errorConfig;
    }

    public void sendErrMail() throws Exception {
         mailSender=new MailSender();
         logReader=new LogReader();
         errorConfig=new ErrorConfig();
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
