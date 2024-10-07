package part1;

// AKL9 ад I3
public abstract class SubscriptionOrderBase implements PaymentProcessor {
    @Override
    public abstract String processPayment(String paymentMethod);
}
