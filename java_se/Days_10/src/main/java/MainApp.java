import utils.DB;

public class MainApp {

    public static void main(String[] args) {

        DB db = new DB();
        db.close();
        db.close();
        db.close();

        db.connect();
        db.close();

        db.connect();
        db.connect();
        db.connect();

    }


}
