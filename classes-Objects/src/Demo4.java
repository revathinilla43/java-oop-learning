

class BankAccount {
    int accountNumber;
    String name;
    int balance;

    void deposit(int amount) {
        balance = balance + amount;
    }

    void withdraw(int amount) {
        balance = balance - amount;
    }

    int displayBalance() {
        return balance;
    }
}

public class Demo4 {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();

        account1.name = "Revathi";
        account1.accountNumber = 101;
        account1.balance = 5000;

        account1.deposit(2000);
        account1.withdraw(1000);

        System.out.println(account1.displayBalance());
    }
}