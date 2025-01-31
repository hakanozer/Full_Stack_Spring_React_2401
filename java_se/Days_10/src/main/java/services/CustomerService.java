package services;

import utils.DB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

    // insert -> data ekleme
    public int addCustomer( String name, String surname, String email, String password ) {
        DB db = new DB();
        int status = 0;
        try {
            String sql = "insert into customer(name,surname,email,password) values(?,?,?,?)";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setString(1, name);
            pre.setString(2, surname);
            pre.setString(3, email);
            pre.setString(4, password);
            status = pre.executeUpdate(); // delete - update - insert
        }catch (Exception ex) {
            System.err.println("addCustomer error: " + ex.getMessage());
        }finally {
            db.close();
        }
        return status;
    }


    public void allCustomer() {
        DB db = new DB();
        List<String> ls = new ArrayList<>();
        try {
            String sql = "select * from customer";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while( rs.next() ) {
               // satır içindeki tüm bilgiler bu bölümdedir.
               int cid = rs.getInt("cid");
               String name = rs.getString("name");
               String surname = rs.getString("surname");
               String email = rs.getString("email");
               String password = rs.getString("password");
               System.out.println(cid + " " + name + " " + surname + " " + email + " " + password);
            }
        }catch (Exception ex) {
            System.err.println("allCustomer error: " + ex.getMessage());
        }finally {
            db.close();
        }
    }

}
