package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// This class can be used to initialize the database connection 
public class DatabaseConnection {

    public static Connection initializeDatabase()
            throws SQLException, ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/hospital";
        String userName = "root";
        String password = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, userName, password);

        return con;
    }
}
