package src;

 class BankAccount{
    private int accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance=balance+amount;
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance(){
        return balance;
    }
    public void display(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Balance: "+balance);
    }
    
}
public class Main{
    public static void main(String[]args){
        BankAccount account=new BankAccount(101,"Revathi",50000);
        System.out.println("Current Balance: "+account.getBalance());
        account.display();

    }
}