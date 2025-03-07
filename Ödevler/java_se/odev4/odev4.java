package odev4;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class odev4 {

    File file;


    public odev4(String isim){
            isim = isim + ".txt";
            file = new File(isim);

    }

    public void createfile(){

        try {
            file.createNewFile();
        } catch (Exception e) {
            System.err.println("HATA");

        }

    }

    public void writeLine (String line){
        try{
            FileWriter fw = new FileWriter(file , true);
            fw.write(line);
            fw.write(System.lineSeparator());
            fw.close();
        }catch (Exception ex){
            System.out.println("writeLine error");
        }

    }


    public void readFile(){
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (Exception ex){
            System.err.println("Read File ERROR");
        }
    }






}


