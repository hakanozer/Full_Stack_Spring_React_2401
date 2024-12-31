package appPack;


public class MainApp {

    public static void main(String[] args) {

        Profile profile = new Profile();
        profile.call("Ali", 100);

        String nick = "super01";
        String name = "Ahmet";
        String surname = "Bilmem";
        profile.write(name,nick,surname);


    }

}
