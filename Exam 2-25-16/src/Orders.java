import java.util.Date;

public class Orders {

    //===========Private Class Attributes======================================
    private int orderId;
    private String customerName, customerId, status, shippingId;
    private Date dateCreated, dateShipped;
    //=========================================================================

    public void placeOrder(){}

    public void updateStatus(String status){ this.status = status; }

    public String getStatus(){ return status; }

}
