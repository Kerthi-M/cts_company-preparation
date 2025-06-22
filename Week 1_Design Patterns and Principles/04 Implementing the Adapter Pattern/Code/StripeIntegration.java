package builder_adapter;
class StripeGateway {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " processed via Stripe.");
    }
}

class StripeAdapter implements PaymentProcessor {
    private StripeGateway gateway = new StripeGateway();

    public void processPayment(double amount) {
        gateway.makePayment(amount);
    }
}
