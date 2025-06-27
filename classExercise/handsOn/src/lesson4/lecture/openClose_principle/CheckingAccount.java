package lesson4.lecture.openClose_principle;

/**
 * fields
 * overDreftLimit: double
 * monthlyFee: double
 * debitCardNumber: String
 */
public class CheckingAccount extends Account{


    public CheckingAccount(String accountNumber, double initialBalance, String ownerName) {
        super(accountNumber, initialBalance, ownerName);
    }

    @Override
    public double getBalance() {
        return 100.0; // Placeholder for balance logic
    }
}
