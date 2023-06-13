package behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentSystem paymentSystem = new PaymentSystem();
        PaymentStrategy paymentStrategy = new CreditCardPayment("venu","12/25","234");
        paymentSystem.setPaymentStrategy(paymentStrategy);
        paymentSystem.processPayment();
        PaymentStrategy paymentStrategy1 = new PaypalPayment("venu@gmail.com","1234");
        paymentSystem.setPaymentStrategy(paymentStrategy1);
        paymentSystem.processPayment();
    }
}
