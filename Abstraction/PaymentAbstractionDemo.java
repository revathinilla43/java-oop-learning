package Abstraction;
abstract class Payment {

    abstract void pay();
}
class UPIPayment extends Payment{
    @Override
    void pay() {
        System.out.println("UPI Payment is Done");
    }
}
class CardPayment extends Payment{
    @Override
    void pay() {
        System.out.println("Card Payment is Done");
    }
}
public class PaymentAbstractionDemo {
    public static void main(String[] args) {
        Payment p=new UPIPayment();
        p.pay();
        Payment p2 = new CardPayment();
        p2.pay();
    }
}