public class OwnerProfile {

    private String name;
    private String type; // Individual or Company
    private Address address;
    private ContactInformation contactInformation;

    public OwnerProfile(String name, String type, Address address, ContactInformation contactInformation) {
        this.name = name;
        this.type = type;
        this.address = address;
        this.contactInformation = contactInformation;
    }

    @Override
    public String toString() {
        return "Owner:\n" +
               name + " (" + type + ")\n" +
               "Address: " + address + "\n" +
               "Contact: " + contactInformation;
    }
}