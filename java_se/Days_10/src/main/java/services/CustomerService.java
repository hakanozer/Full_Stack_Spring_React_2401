package services;

import utils.DB;

import java.sql.PreparedStatement;

public class CustomerService {

    public CustomerService() {
        DB db = new DB();
        try {
            String sql = "create table if not exists customer(\n" +
                    "    cid INTEGER primary key auto_increment,\n" +
                    "    name TEXT(100),\n" +
                    "    surname TEXT(100),\n" +
                    "    email TEXT(100),\n" +
                    "    password TEXT(10)\n" +
                    ")";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.executeUpdate();
        }catch (Exception ex) {
            System.err.println("DB Error: " + ex.getMessage());
        }finally {
            db.close();
        }
    }

}
