package useStatic;

public class Security {

    public static boolean loginControl(int userID) {
        if ( userID == 1 ) {
            return true;
        } else if (userID == 2) {
            return true;
        }else {
            return false;
        }
    }

}
