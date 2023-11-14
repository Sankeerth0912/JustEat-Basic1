import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySqlCon {
    private static final String URL = "jdbc:mysql://localhost:3306/pizza2";
    private static final String USER = "root";
    private static final String PASSWORD = "singam";

    public Connection getCon() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    // Create Operation
    public void insertData(String name, double price) {
        try (Connection con = getCon();
             PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO pizza2 (name, price) VALUES (?, ?)")) {

            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, price);
            preparedStatement.executeUpdate();
            System.out.println("Data inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Read Operation
    public void fetchData() {
        try (Connection con = getCon();
             PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM pizza2");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Price: " + resultSet.getDouble("price"));
                System.out.println("--------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update Operation
    public void updateData(int id, double newPrice) {
        try (Connection con = getCon();
             PreparedStatement preparedStatement = con.prepareStatement("UPDATE pizza2 SET price = ? WHERE id = ?")) {

            preparedStatement.setDouble(1, newPrice);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            System.out.println("Data updated successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete Operation
    public void deleteData(int id) {
        try (Connection con = getCon();
             PreparedStatement preparedStatement = con.prepareStatement("DELETE FROM pizza2 WHERE id = ?")) {

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Data deleted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MySqlCon mySqlCon = new MySqlCon();
        
        // Example of CRUD operations
        mySqlCon.insertData("Margherita", 9.99);
        mySqlCon.fetchData();
        mySqlCon.updateData(1, 10.99);
        mySqlCon.fetchData();
        mySqlCon.deleteData(1);
        mySqlCon.fetchData();
    }
}
