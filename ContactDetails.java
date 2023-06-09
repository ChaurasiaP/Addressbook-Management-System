//  UC 5
public class ContactDetails {
    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private int zip_code;
    private String phone_number;
    private String email;


    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }


    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }


    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }


    public int getZip_code() {
        return zip_code;
    }
    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }


    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
        @Override
    public String toString() {
        return "\nAddress Book Entry: \nFrist Name: " + first_name + " Last Name: " + last_name + "\nAddress: "
                + address + " City Name: " + city + " Zip Code: " + zip_code + "\nPhone Number: " + phone_number + " Email: " + email;
    }
}
