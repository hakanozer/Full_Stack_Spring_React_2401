package useInterface;

public class UserImpl implements IUser {

    int a = 10;
    int b = 20;

    @Override
    public boolean userLogin(String username, String password) {
        return false;
    }

    @Override
    public String userName(int id) {
        return "";
    }

    @Override
    public void logout(int id) {

    }

    public void sum(int num1, int num2) {
        int sm = num1 + num2;
        System.out.println(sm);
    }

}
