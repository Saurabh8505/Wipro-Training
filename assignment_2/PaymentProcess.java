package assignment_2;
abstract class PaymentMethod{
   abstract void processPayment(double amount);
}
class crediCard extends PaymentMethod{
    double TRANSACTION_FEE = 2.0;
    void processPayment(double amount){
        double totalAmount = amount + TRANSACTION_FEE;
        System.out.println("Processing Credit Card payment of" + amount + " with fee. Total: $" + totalAmount);
    }

}
class PayPal extends PaymentMethod{
    void processPayment(double amount){
        System.out.println("Processing Online payment of" + amount + " with 0 Extra Charges");
     }

}
public class PaymentProcess {
    public static void processTransaction(PaymentMethod paymentMethod,double amount){
       paymentMethod.processPayment(amount);
    }
    public static void main(String[] args){
        PaymentMethod CardPayment = new crediCard();
        PaymentMethod onlinePayment = new PayPal();

        System.out.println("Performing transactions:");
        processTransaction(CardPayment, 100.0);
        processTransaction(onlinePayment, 100.0);
    }
}
