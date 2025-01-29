package mainApp;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileControl {

    File file;

    public FileControl(String fileName) {
        fileName = fileName + ".txt";
        file = new File(fileName);
    }

    public void createNewFile() {
        try {
            file.createNewFile();
        }catch (Exception e) {
            System.err.println("file create error");
        }
    }

    public void deleteFile() {
        file.delete();
    }

    public void writeLine(String line) {
        try {
            List<String> ls = readFile();
            FileWriter fw = new FileWriter(file, true);
            line = (ls.size() + 1) + " - " + line;
            fw.write(line); // -> windows \r\n, -> mac \n
            fw.write(System.lineSeparator());
            fw.close(); // yazma işlemi burada tamamlanır.
        }catch (Exception ex) {
            System.err.println("writeLine error");
        }
    }

    public List<String> readFile() {
        List<String> lines = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lines.add(line);
            }
            sc.close();
        }catch (Exception ex) {
            System.err.println("readFile error");
        }
        return lines;
    }

}
