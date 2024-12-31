package appPack;

public class Profile {

    /**
     * this function name and age number data contact eq: {@link String#concat(String)}
     * @param name user name String data
     * @param age user age int data
     * @return name and age contact String
     * @author <a href="mailto:ali@mail.com">Ali</a>
     * @see String
     * @since 21
     * @throws ArrayIndexOutOfBoundsException
     * @throws RuntimeException
     *
     */
    public String call( String name, int age ) {
        String data = name + "" + age;
        return data;
    }



    public int write( String nick ) {
        return nick.length();
    }

    public boolean write( String nick, String name ) {
        return true;
    }

    public void write( String nick, String name, String surname ) {
        String data = nick + " " + name + " " + surname;
        System.out.println(data);
    }



}
