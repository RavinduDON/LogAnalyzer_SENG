package lk.uok.se.DBManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtility {
    public static PreparedStatement getPreaparedStatement(String sql, Object...str) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        for (int i = 0; i < str.length; i++) {
            pstm.setObject(i+1,str[i]);
        }
        return pstm;
    }

    public static int exuteUpdate(String sql,Object...str) throws ClassNotFoundException, SQLException{
        return getPreaparedStatement(sql, str).executeUpdate();
    }

    public static ResultSet exuteQuery(String sql, Object...str) throws ClassNotFoundException, SQLException{
        return getPreaparedStatement(sql, str).executeQuery();
    }
}
