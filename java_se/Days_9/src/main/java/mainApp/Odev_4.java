package mainApp;

import java.util.List;
import java.util.UUID;

public class Odev_4 {
    public static void main(String[] args) {

        FileControl fileControl = new FileControl("odev");
        fileControl.writeLine( UUID.randomUUID().toString() );
        List<String> ls = fileControl.readFile();
        System.out.println(ls);

    }
}
