package app_pack;


public class ElseIf {
    public static void main(String[] args) {

        String name = "Ali Bilmem";
        String email = "ali@bilmem.com";
        String password = "12345";

        if ( name.equals("") || email.equals("") || password.equals("") ) {
            System.out.println("Lütfen tüm alanları doldurunuz!");
        }else {

        }

        if (name.equals("")) {
            System.out.println("Name Empty!");
        }else  {
            System.out.println("Name Success");
        }

        if (email.equals("")) {
            System.out.println("Email Empty!");
        }else {
            System.out.println("Email Success");
        }

        if (password.equals("")) {
            System.out.println("Password Empty!");
        }else {
            System.out.println("Password Success");
        }

        System.out.println("===================");
        // else - if
        if(name.equals("")) {
            System.out.println("Name Empty!");
        }else if (email.equals("")) {
            System.out.println("Email Empty!");
        }else if (password.equals("")) {
            System.out.println("Password Empty!");
        }else {
            System.out.println("Form Success");
        }



    }
}
