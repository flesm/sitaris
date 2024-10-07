package part1;

// I3 ад I1
public interface PaymentProcessor extends OrderProcessor {
    String processPayment(String paymentMethod);
}
