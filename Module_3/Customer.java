package Module_3;

public class Customer {
    private String name;
    private String address;
    private String city;
    private String zip;

    public Customer(){
        name = "";
        address = "";
        city = "";
        zip = "";
    }

    public Customer(String name, String address, String city, String zip){
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return city;
    }

    public void setZip(String zip){
        this.zip = zip;
    }

    public String getZip(){
        return zip;
    }

    public String toString(){
        return getName() + "\n" + getAddress() + "\n" + getCity() + ", " + getZip();
    }

}
