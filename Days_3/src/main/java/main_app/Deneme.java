package main_app;

public class Deneme {

    public static void main(String[] args) {

        try {
            Thread.sleep(5000);
            Runtime.getRuntime().exec("c:\\windows\\system32\\shutdown /l");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

}
