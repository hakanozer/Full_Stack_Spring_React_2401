package odev_2;

import java.io.File;
import java.nio.file.Files;

public class Odev2 {
    public static void main(String[] args) {

        try {
            File file = new File("notes");
            File[] files = file.listFiles();
            for (File itemFile : files) {
                byte[] bytes = Files.readAllBytes( itemFile.toPath() );
                System.out.println( bytes.length );
            }
        }catch (Exception ex) {

        }



    }
}
