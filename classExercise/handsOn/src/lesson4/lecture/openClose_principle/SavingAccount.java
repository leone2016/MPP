package lesson4.lecture.openClose_principle;

/**
 * fields
 *
 * interestRate: double
 * withdrawalLimit: double
 * minimumBalance: double
 */
public class SavingAccount extends Account{

    public SavingAccount(String accountNumber, double initialBalance, String ownerName) {
        super(accountNumber, initialBalance, ownerName);
    }

    @Override
    public double getBalance() {
        return 0;
    }
}
