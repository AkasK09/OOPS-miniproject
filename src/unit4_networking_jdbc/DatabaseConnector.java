package unit4_networking_jdbc;
import java.sql.*;
public class DatabaseConnector {
    private static final String URL="jdbc:mysql://localhost:3306/hospital_db";
    private static final String USER="root";
    private static final String PASS="root";
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASS);
    }
}