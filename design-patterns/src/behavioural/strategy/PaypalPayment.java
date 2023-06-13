package behavioural.strategy;

public class PaypalPayment implements PaymentStrategy{
    private String email;
    private String password;

    public PaypalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }
    @Override
    public void processPayment() {
        System.out.println("Processing Payment through Paypal :"+email+" "+password);
    }
}
