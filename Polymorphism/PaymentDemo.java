package Polymorphism;

class Payment{
    void pay(){
        System.out.println("Payment is Done");
    }
}
class UPIPayment extends Payment{
@Override 
void pay(){
    System.out.println("UPI Payment is Done");
}
}
class CardPayment extends Payment{
    @Override
    void pay(){
        System.out.println("Card Payment is Done");
    }
}
public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new UPIPayment();
        p1.pay();
        Payment p2 = new CardPayment();
        p2.pay();
    }
}
