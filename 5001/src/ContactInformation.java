public class ContactInformation {

    private String phone;
    private String email;

    public ContactInformation(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return phone + " / " + email;
    }
}