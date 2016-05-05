/**
 * Created by William Lin
 */
public class Client{

    public static void main(String[] args){
        Customer customer1 = new Customer();
        customer1.setName("William");
        customer1.setAddress("123 Street St");
        VIPCustomer customer2 = new VIPCustomer();
        customer2.setId("12345");
        customer2.setName("Alyson");
        customer2.setAddress("1234 Street St");
        customer1.getAddress();
    }

}
