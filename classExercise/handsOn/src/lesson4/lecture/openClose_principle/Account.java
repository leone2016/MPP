package lesson4.lecture.openClose_principle;

public abstract class Account {
    private String accountNumber;
    private double balance;
    private String ownerName;

    public Account(String accountNumber, double initialBalance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.ownerName = ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

   /* public double getBalance() {
        return balance;
    }*/

   /* public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
    }*/

    public String getOwnerName() {
        return ownerName;
    }
//    public abstract void withdraw(double amount);
    public abstract double getBalance();
}
