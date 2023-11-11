/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseConnection;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * This is a singleton class which is being used for making a database
 * connection
 *
 * @author pc
 */
public class DatabaseConnection {

    private static Connection con = null;

    static {
        try {
            String userHome = System.getProperty("user.home");
            String dbName = "gymdatabase.db";
            String url = "jdbc:sqlite:" + userHome + File.separator + dbName;
            con = DriverManager.getConnection(url);

            Statement stmt = con.createStatement();

            // create logintable and members_table
            String createLogintableSql = "CREATE TABLE IF NOT EXISTS logintable (\n"
                    + "    id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                    + "    username TEXT NOT NULL,\n"
                    + "    password TEXT NOT NULL\n"
                    + ")";
            String createMembersTableSql = "CREATE TABLE IF NOT EXISTS members_table (\n"
                    + "    id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                    + "    name_surname TEXT NOT NULL,\n"
                    + "    memb_begin DATE,\n"
                    + "    memb_end DATE,\n"
                    + "    fee_paid INTEGER,\n"
                    + "    fee_topay INTEGER\n"
                    + ")";

            stmt.executeUpdate(createLogintableSql);
            stmt.executeUpdate(createMembersTableSql);

            // insert initial data into logintable
            String insertDataSql = "INSERT INTO logintable (username, password) "
                    + "SELECT 'owner', 'admin123' WHERE NOT EXISTS "
                    + "(SELECT 1 FROM logintable WHERE username = 'owner' AND password = 'admin123');"
                    + "INSERT INTO logintable (username, password) "
                    + "SELECT 'desk', 'desk123' WHERE NOT EXISTS "
                    + "(SELECT 1 FROM logintable WHERE username = 'desk' AND password = 'desk123')";
            stmt.executeUpdate(insertDataSql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return con;
    }

}
