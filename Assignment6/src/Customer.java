/**
 * Created by William Lin
 */
public class Customer{

    private String name, address;

    public Customer(){}

    //Exists in parent class but not in child class
    public String getAddress(){
        return address;
    }

    //Method overridden by child class
    public String getName(){
        return name;
    }

    //Method overridden by child class
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

}
