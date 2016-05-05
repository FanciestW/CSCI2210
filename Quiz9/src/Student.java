/**
 * Created by wlin on 4/20/16.
 */
public class Student {

    private String name, street, city, state, zip;

    Student(String name, String street, String city, String state, String zip){
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getName(){
        return name;
    }

    public String getStreet(){
        return street;
    }

    public String getCity(){
        return city;
    }

    public String getState(){
        return state;
    }

    public String getZip(){
        return zip;
    }
}
