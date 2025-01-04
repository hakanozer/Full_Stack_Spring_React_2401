package useInterface;

public interface IUser {

    boolean userLogin(String username, String password);
    String userName( int id );
    void logout(int id);

}
