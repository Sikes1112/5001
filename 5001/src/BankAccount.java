public class BankAccount {

    private OwnerProfile ownerProfile;
    private String currency;
    private String accountType; // Chequing or Saving
    private double balance;

    public BankAccount(OwnerProfile ownerProfile, String currency, String accountType, double balance) {
        this.ownerProfile = ownerProfile;
        this.currency = currency;
        this.accountType = accountType;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return ownerProfile + "\n" +
               "Account: " + accountType + " (" + currency + ")\n" +
               "Balance: " + balance + " " + currency;
    }
}