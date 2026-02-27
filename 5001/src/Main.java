public class Main {

    public static void main(String[] args) {

        // ===== Account 1 =====
        Address address1 = new Address(
                "100 Bay St",
                "Toronto",
                "ON",
                "Canada",
                "A1A 1A1"
        );

        ContactInformation contact1 = new ContactInformation(
                "566-888-8888",
                "my@gmail.com"
        );

        OwnerProfile owner1 = new OwnerProfile(
                "Renna",
                "Individual",
                address1,
                contact1
        );

        BankAccount account1 = new BankAccount(
                owner1,
                "CAD",
                "Chequing",
                100000
        );

        System.out.println(account1);
        System.out.println();


        // ===== Account 2 =====
        Address address2 = new Address(
                "150 Queen St",
                "Toronto",
                "ON",
                "Canada",
                "A2A 2A2"
        );

        ContactInformation contact2 = new ContactInformation(
                "455-666-7778",
                "mom@gmail.com"
        );

        OwnerProfile owner2 = new OwnerProfile(
                "Lisa",
                "Individual",
                address2,
                contact2
        );

        BankAccount account2 = new BankAccount(
                owner2,
                "USD",
                "Chequing",
                500000
        );

        System.out.println(account2);
        System.out.println();


        // ===== Account 3 =====
        Address address3 = new Address(
                "150 Queen St",
                "Toronto",
                "ON",
                "Canada",
                "A2A 2A2"
        );

        ContactInformation contact3 = new ContactInformation(
                "233-455-6667",
                "dad@gmail.com"
        );

        OwnerProfile owner3 = new OwnerProfile(
                "Tom",
                "Company",
                address3,
                contact3
        );

        BankAccount account3 = new BankAccount(
                owner3,
                "CAD",
                "Saving",
                900000
        );

        System.out.println(account3);
        System.out.println();
    }
}