package lk.uok.se.UI;

import lk.uok.se.ErrorConfiguration.ErrorConfig;
import lk.uok.se.FileHandling.LogReader;
import lk.uok.se.Mail.MailSender;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class SendMailTest {

    @Test
    public void Should_Send_Email_From_ErrorConfig() {
        MailSender mailSender=mock(MailSender.class);
        LogReader logReader=mock(LogReader.class);
        ErrorConfig errorConfig=mock(ErrorConfig.class);



    }
}