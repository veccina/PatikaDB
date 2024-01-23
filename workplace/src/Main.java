import java.sql.*;

public class Main {
    public static final String DB_URL = "jdbc:mysql://localhost/workplace";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String position = rs.getString("position");
                int salary = rs.getInt("salary");

                System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position + ", Salary: " + salary);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

}