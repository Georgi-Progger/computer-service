package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionFactory {
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/computer_db";

    static final String USER = "postgres";
    static final String PASSWORD = "georkryt";

    public static void getConnection(){
        try{
            Class.forName(JDBC_DRIVER).getDeclaredConstructor().newInstance();
            // команда создания таблицы
            String sqlCommand = "CREATE TABLE products ( str VARCHAR(255));";

            try (Connection conn = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD)){

                Statement statement = conn.createStatement();
                // создание таблицы
                statement.executeUpdate(sqlCommand);

                System.out.println("Database has been created!");
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
}
