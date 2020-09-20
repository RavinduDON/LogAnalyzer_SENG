package lk.uok.se.DBManagement;

import lk.uok.se.DTO.Email;
import lk.uok.se.Mail.MailRepository;

import java.util.*;

public interface DBRepository {

    public boolean add(Email dto) throws Exception;
    public List<Email> getAll() throws Exception;

}
