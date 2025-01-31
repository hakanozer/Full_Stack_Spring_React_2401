import services.CustomerService;

public class MainApp {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();

        // Data ekleme
        // int addStatus = customerService.addCustomer("Kasım", "Duyar", "kasim@mail.com","12345");
        // System.out.println("Add status: " + addStatus);

        // Data Çekme
        customerService.allCustomer();

    }


}
