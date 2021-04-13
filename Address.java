package Version2;
public class Address {
    private String street ;
    private String city ;
    private String state ;

    //constructors
    public  Address  ()
    {
    }

    public  Address  (String s ,String c , String st  )
    {
        street=s ;
        city = c ;
        state = st ;
    }

    //mutators
    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    //accessors
    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getStreet() {
        return street;
    }

    public String getFullAddress()
    {
        return street +", " + city + ", "+ state ;
    }
}
