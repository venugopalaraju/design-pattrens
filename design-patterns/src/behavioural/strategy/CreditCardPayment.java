package behavioural.strategy;

public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Payment through Credit Card :"+cardNumber+" "+expiryDate+" "+cvv);
    }
}
