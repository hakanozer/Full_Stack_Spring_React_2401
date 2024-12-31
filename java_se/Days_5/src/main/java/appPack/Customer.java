package appPack;

public class Customer {

    // default kurucu method
    // her sınıf Object sınıfından miras alır.
    // Bir kurucu method yazdığımızda defult olarak gelen iptal edilir.
    // kurucu methodlar sınıfın hazır bulunuşluğunu artırırlar
    // bir sınıfın farklı yeteneklerde çalışmasını sağlar

    // kurucu method nasıl oluşturulur.
    // erişim belirteci alır.
    // void yada return almaz
    // Sınıf ismi ile aynı isme sahip olmalıdırlar.

    String role = "user";
    public Customer() {
        System.out.println("Empty Constructor");
    }

    public Customer(String role) {
        this.role = role;
        // this kullanıldığı methodun sınıfı işaret eder.
    }

    public void login() {
        System.out.println(role +  " Login ");
    }

}
