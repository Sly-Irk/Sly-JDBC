package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String HOST = "localhost";
    private static final String PORT = "3306";
    private static final String DB_NAME = "test";
    private static final String LOGIN = "root";
    private static final String PASS = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + HOST + ":" + PORT + "/" + DB_NAME, LOGIN, PASS);
            System.out.println("Соединение УСТАНОВЛЕНО!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("В соединении произошла ОШИБКА!!!");
        }
        return connection;
    }
}
