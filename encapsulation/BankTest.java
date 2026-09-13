package encapsulation;

 class BankAccount{
      private String accountHolder;
    private int accountNumber;
    private double balance;

    // Setter for account holder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter for account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for account number
    public void setAccountNumber(int accountNumber) {
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Account number must be positive");
        }
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Deposit amount must be greater than 0");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Invalid withdrawal");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}
public class BankTest{

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountHolder("Revathi");
        account.setAccountNumber(101);

        account.deposit(5000);
        account.withdraw(1000);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }
}
