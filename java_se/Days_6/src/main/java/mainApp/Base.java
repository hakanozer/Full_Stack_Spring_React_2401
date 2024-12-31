package mainApp;

public class Base {

    // Bir sınıf farklı bir sınıfa miras verdiğinde mirası alan sınıf
    // mirası veren sınıfın bütün yeteneklerine sahip olur.

    // private -> sadece kendi sınıfının içindeki üyelere hizmet etmek için kullanılır.
    private int count = 20;

    protected String baseName = "baseName";

    public Base() {
        System.out.println("Base Call");
    }

    public void call() {
        write("");
    }

    public void write( String name ) {
        System.out.println("name :" + name + " count :" + count);
    }

    // override edilemez
    // miras olarak verilebilir.
    final public void computer() {
        mouse();
        System.out.println("compoter");
    }

    // private -> miras olarak verilemez
    private void mouse() {
        System.out.println("mouse");
    }

}
