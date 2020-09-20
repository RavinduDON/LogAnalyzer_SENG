package lk.uok.se.DBManagement;

import lk.uok.se.DTO.Email;

import java.sql.ResultSet;
import java.util.*;

public class DBPerformAction implements DBRepository {

    //add emails
    @Override
    public boolean add(Email dto) throws Exception {
        String sql="INSERT into email (address) values(?)";
        int executeUpdate=DBUtility.exuteUpdate(sql,dto.getAddress());
        if (executeUpdate>0){
            return true;
        }
        else{
            return false;
        }



    }

    //retrieve emails
    @Override
    public List<Email> getAll() throws Exception{
        String sql="SELECT * from email";
        ResultSet rst=DBUtility.exuteQuery(sql);
        List<Email> list=new ArrayList<>();
        while (rst.next()){
            String id=rst.getString(1);
            String address= rst.getString(2);

            Email dto1=new Email(Integer.parseInt(id),address);
            list.add(dto1);
        }
        return list;
    }
}