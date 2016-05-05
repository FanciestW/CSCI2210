public class Customer {

    //===========Private Class Attributes======================================
    private String address, email, creditCardInfo, shoppingInfo;
    public String customerName;
    private int phoneNo;
    //=========================================================================

    public void register(String name){ customerName = name; }

    public void login(){}

    public void updateProfile(){}

    public void updateCustomerName(String name){ this.customerName = name; }

    public String getCustomerName(){ return customerName; }

    //Composition Relation between Orders
    private Orders order = new Orders();

    //Composition Relation between Shopping Cart
    private ShoppingCart cart = new ShoppingCart();

}
