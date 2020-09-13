package DatabaseManagement;

import java.sql.*;

public class DBConnection {

    private static DBConnection dBConnection;
    private Connection connection;

    public DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/Emails", "root", "");

    }

    public static DBConnection getDBConnection() throws ClassNotFoundException, SQLException {
        if (dBConnection == null) {
            dBConnection = new DBConnection();
            System.out.println("Successfully connected");
        }
        return dBConnection;
    }

    public Connection getConnection() {
        return connection;
    }

}
