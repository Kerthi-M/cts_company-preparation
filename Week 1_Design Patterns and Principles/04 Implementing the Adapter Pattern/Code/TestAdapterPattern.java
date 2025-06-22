package builder_adapter;

public class TestAdapterPattern {
    public static void main(String[] args) {
        PaymentProcessor processor1 = new PayPalAdapter();
        processor1.processPayment(100.0);

        PaymentProcessor processor2 = new StripeAdapter();
        processor2.processPayment(250.0);

        PaymentProcessor processor3 = new RazorpayAdapter();
        processor3.processPayment(500.0);
    }
}
