public class Address {
    private String streetName;
    private String streetNumber;

    //0 parameter constructor
    public Address(){
        streetName = "Unknown";
        streetNumber = "Unknown";
    }

    //2 parameter constructor
    public Address(String name, String number){
        streetName = name;
        streetNumber = number;
    }

    //get and set methods
    public String getStreetName(){ return streetName; }
    public String getStreetNumber(){ return streetNumber; }
    public void setStreetName(String sNa){streetName = sNa;}
    public void setStreetNumber(String sNu){streetName = sNu;}

    //to String method returning street name and number
    public String toString(){
        return streetNumber + " " + streetName;
    }
}
