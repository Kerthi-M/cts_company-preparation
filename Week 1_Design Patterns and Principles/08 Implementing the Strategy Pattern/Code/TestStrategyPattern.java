package Strategy;

public class TestStrategyPattern {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.processPayment(150.0);

        context.setStrategy(new PayPalPayment());
        context.processPayment(300.0);
    }
}
