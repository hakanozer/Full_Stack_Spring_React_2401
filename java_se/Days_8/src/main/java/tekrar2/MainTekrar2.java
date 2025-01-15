package tekrar2;

public class MainTekrar2 {
    public static void main(String[] args) {

        PersonImpl x = new PersonImpl();
        IPerson y = new PersonImpl();
        ICustomer z = new PersonImpl();
        Object t = new PersonImpl();

        if (t instanceof PersonImpl) {
            PersonImpl p = (PersonImpl) t;
            System.out.println(p.a);
        }


    }
}
