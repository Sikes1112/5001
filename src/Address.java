public class Address {

    private String street;
    private String city;
    private String stateProvince;
    private String country;
    private String postalCode;

    public Address(String street, String city, String stateProvince, String country, String postalCode) {
        this.street = street;
        this.city = city;
        this.stateProvince = stateProvince;
        this.country = country;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + stateProvince + ", " + country + " " + postalCode;
    }
}