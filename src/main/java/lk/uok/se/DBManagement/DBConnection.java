package lk.uok.se.DBManagement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dBConnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LogAnalyzer", "root", "1234");
    }

    public static DBConnection getDBConnection() throws ClassNotFoundException, SQLException {
        if (dBConnection == null) {
            dBConnection = new DBConnection();
            System.out.println("Database successfully connected...");
        }
        return dBConnection;
    }

    public Connection getConnection() {
        return connection;
    }


}
