package properties;

public class MainProperties {
    public static void main(String[] args) {

        User u1 = new User();
        u1.setName("Ali");
        u1.setSurname("Bilmem");
        u1.setEmail("ali@mail.com");
        u1.setPassword("12345");

        User u2 = new User();
        u2.setName("Erkan");
        u2.setSurname("Bilirim");
        u2.setEmail("erkan@mail.com");
        if (true) {
            u2.setPassword("12345");
        }else {
            u2.setPassword("54321");
        }

        User u3 = new User("Zehra", "Bil", "zehra@mail.com", "12345");

        User[] users = {u1, u2, u3};
        for (User item : users) {
            System.out.println( item );
        }
    }
}
