package by.belhard.j24.MyFirstProject.repository;

import by.belhard.j24.MyFirstProject.model.ATMGum;

import java.sql.*;

public class ATMGumRepository {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/bh24?serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private static Connection connection;

    public static Connection getConnection() throws SQLException {

        if (connection == null) {
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        }

        return connection;
    }


    public static ATMGum getById(int ATMGumNumber) throws SQLException, ItemNotFoundException {

        PreparedStatement preparedStatement =
                getConnection().prepareStatement("select * from atmgum where id = ?;");
        preparedStatement.setInt(1, ATMGumNumber);
        preparedStatement.setInt(2, ATMGumNumber);
        preparedStatement.setInt(3, ATMGumNumber);


        ResultSet resultSet = preparedStatement.executeQuery();

        while (!resultSet.next())
            throw new ItemNotFoundException();

        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        int cash = resultSet.getInt("cash");

        return new ATMGum(id,name,cash);
    }

}
