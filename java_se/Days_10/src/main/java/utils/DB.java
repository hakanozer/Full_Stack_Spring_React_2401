package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    private final String driver = "org.h2.Driver";
    private final String url = "jdbc:h2:file:~/full_stack";
    private final String user = "sa";
    private final String password = "sa";

    private Connection con = null;

    public Connection connect() {
        try {
            if (con == null || con.isClosed()) {
                Class.forName(driver);
                con = DriverManager.getConnection(url, user, password);
                System.out.println("Connection Success");
            }
        }catch (Exception ex) {
            System.err.println("Connection Error : " + ex);
        }
        return con;
    }

    public void close() {
        try {
            if ( con != null && !con.isClosed() ) {
                con.close();
                System.out.println("Connection Closed");
            }
        } catch (Exception e) {
            System.err.println("Close Error : " + e);
        }
    }

}
