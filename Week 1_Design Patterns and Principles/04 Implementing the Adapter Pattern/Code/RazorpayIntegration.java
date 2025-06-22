package builder_adapter;

 class RazorpayGateway {
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " processed via Razorpay.");
    }
}

class RazorpayAdapter implements PaymentProcessor {
    private RazorpayGateway gateway = new RazorpayGateway();

    public void processPayment(double amount) {
        gateway.pay(amount);
    }
}
