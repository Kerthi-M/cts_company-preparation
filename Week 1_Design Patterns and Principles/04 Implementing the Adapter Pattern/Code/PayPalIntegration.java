package builder_adapter;
 class PayPalGateway {
    public void sendPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed via PayPal.");
    }
}

class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway gateway = new PayPalGateway();

    public void processPayment(double amount) {
        gateway.sendPayment(amount);
    }
}
