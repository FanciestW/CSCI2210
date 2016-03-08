/**
 * Created by William on 2/25/2016.
 */
public class Client {

    public static void main(String[] args){
        Customer customer = new Customer();
        ShoppingCart cart = new ShoppingCart();
        Orders order = new Orders();
        VIPCustomer vip = new VIPCustomer();
        customer.getCustomerName();
        cart.checkout();
        order.getStatus();
        vip.getCustomerName();
        String name = vip.customerName;
    }

}

//What is the nature relation between [Client] class and all three classes and why ?

//The nature relation between the client class and all three classes is an use-a relationship because client uses all three classes.