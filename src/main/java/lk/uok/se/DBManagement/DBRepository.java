package lk.uok.se.DBManagement;

import lk.uok.se.DTO.Email;

import java.util.ArrayList;

public interface DBRepository {

    public boolean add(Email dto) throws Exception;
    public ArrayList<Email> getAll() throws Exception;

}
