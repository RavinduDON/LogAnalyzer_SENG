package lk.uok.se.DBManagement;

import lk.uok.se.DTO.Email;

import java.util.ArrayList;

public class DBPerformAction implements DBRepository {

    @Override
    public boolean add(Email dto) throws Exception {
        return false;
    }

    @Override
    public ArrayList<Email> getAll() throws Exception {
        return null;
    }
}
