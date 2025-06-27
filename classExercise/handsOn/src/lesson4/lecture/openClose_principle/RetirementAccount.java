package lesson4.lecture.openClose_principle;

public class RetirementAccount extends Account {

    public RetirementAccount(String accountNumber, double initialBalance, String ownerName) {
        super(accountNumber, initialBalance, ownerName);
    }

    @Override
    public double getBalance() {
        return 0;
    }
}
