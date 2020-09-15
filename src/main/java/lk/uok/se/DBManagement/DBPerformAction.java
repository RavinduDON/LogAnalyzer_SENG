package lk.uok.se.DBManagement;

import lk.uok.se.DTO.Email;

import java.sql.ResultSet;
import java.util.ArrayList;

public class DBPerformAction implements DBRepository {

    //add emails
    @Override
    public boolean add(Email dto) throws Exception {
        String sql="INSERT into emails values(?,?)";
        int exuteUpdate=DBUtility.exuteUpdate(sql,dto.getId(),dto.getAddress());
        int executeUpdate>0){
            return true;

        }else{
            return false;
        }



    }

    //retrieve emails
    @Override
    public ArrayList<Email> getAll() throws Exception{
        String sql="SELECTE * from Emails";
        ResultSet rst=DBUtility.exuteQuery(sql);
        ArrayList<Email> list=new ArrayList<>();
        while (rst.next()){
            String id=rst.getString(1);
            String address= rst.getString(2);

            Email dto1=new Email(id,address);
            list.add(dto1);
        }
        return list;
    }
}