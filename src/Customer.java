public class Customer {
    private String firstName;
    private String lastName;
    private Address address;
    private String phoneNumber;

    // zero parameter constructor
    public Customer(){
        firstName = "Unknown";
        lastName = "Unknown";
        address = null;
        phoneNumber = "???-???-????";
    }
    //4 parameter constructor
    public Customer(String f, String l, Address a, String p){
        firstName = f;
        lastName = l;
        address = a;
        phoneNumber = p;
    }

    //These are get and set methods for the Customer class
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public Address getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setFirstName(String s) { firstName = s; }
    public void setLastName(String s) { lastName = s; }
    public void setAddress(Address a) { address = a; }
    public void setPhoneNumber(String p) { phoneNumber = p; }

    //This returns a string to the customer
    public String toString(){
        return "Customer:" + firstName + " " + lastName + "living at: " + address;
    }
}
