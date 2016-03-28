/**
 * Created by William Lin
 */
public class VIPCustomer extends Customer{

    private String vipId, vipName;

    public VIPCustomer(){}

    //Method exists in child but extend usage to parent
    public String getId(){
        return vipId;
    }

    //Overriding getName() from Parent Class
    public String getName(){
        return vipName;
    }

    public void setId(String id){
        this.vipId = id;
    }

    public void setName(String name){
        this.vipName = name;
    }
}
