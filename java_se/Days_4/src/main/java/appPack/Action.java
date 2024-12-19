package appPack;

public class Action {

    int a = 10;

    // Fonksiyonlar - Methodlar
    public void write() {
        int i = 100;
        int b = 433;
        int sum = i - b;
        Profile profile = new Profile();
        System.out.println(profile.name);
        System.out.println("this line call: " + sum);
    }

    public void nameWrite(String name, String surname) {
        int size = name.length() + surname.length();
        String nameSurname = name + " " + surname;
        System.out.println(nameSurname + " - " + size);
    }

    // kullanıcı adı ve şifre ile giriş yapan bir fonksiyon
    // userLogin("ali","a1234") giriş başarılı, giriş hatalı
    public void userLogin(String userName, String password) {
        if ( userName.equals("ali") && password.equals("a1234") ) {
            System.out.println("Giriş Başarılı");
        }else {
            System.out.println("Giriş Hatalı!");
        }
    }

    // bir telefon numarası al
    // bu  numaranın 10 karakter olması durumunda "doğru" bunlar dışında olması durumunda "yanlış"
    // validPhone("23456789")
    public void validPhone(String phone) {
        if( phone.length() == 10 ) {
            System.out.println("Doğru");
        }else {
            System.out.println("Yanlış");
        }
    }

    // almış olduğu 2 ondalıklı sayının 4 işlemini yapan fonksiyon
    public void fncAction(double number1, double number2) {
        double topla = number1 + number2;
        double cikar = number1 - number2;
        double carp = number1 * number2;
        double bol = number1 / number2;

        System.out.println(topla);
        System.out.println(cikar);
        System.out.println(carp);
        System.out.println(bol);
    }

    // bir String ifadenin karakter sayısı ile bir sayıyı toplan bir fonksiyon
    // charSumNumber("Erdal", 100)
    public void charSumNumber(String name, int number) {
        int size = name.length();
        int sum = size + number;
        System.out.println("Sum : " + sum);
    }

}
