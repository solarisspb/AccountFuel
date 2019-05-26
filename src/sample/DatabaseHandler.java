package sample;

import java.sql.*;

public class DatabaseHandler extends Configs{
    Connection dbConnection;

    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbhost + ":"
                + dbport + "/" + dbName;

        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString,
                dbUser, dbPass);
        return dbConnection;

    }

    public void registrationUser(String firstName, String lastName, String login,
                                 String password, String administrator,
                                 String manager, String mechanic) {
        String insert = "INSERT INTO" + Const.USER_TABLE + "(" + Const.USERS_FIRSTNAME + "," +
                Const.USERS_LASTNAME + "," + Const.USERS_LOGIN + "," + Const.USERS_PASSWORD + "," +
                Const.USERS_ADMINISTRATOR + "," + Const.USERS_MANAGER + "," + Const.USERS_MECHANIC + ")" +
                "VALUES(?,?,?,?,?,?,?)";




        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, firstName);
            prSt.setString(2, lastName);
            prSt.setString(3, login);
            prSt.setString(4, password);
            prSt.setString(5, administrator);
            prSt.setString(6, manager);
            prSt.setString(7, mechanic);
            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
