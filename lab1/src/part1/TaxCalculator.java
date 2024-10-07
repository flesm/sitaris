package part1;

// I10 ад I3 і I5
public interface TaxCalculator extends PaymentProcessor, DiscountCalculator, NotificationSender {
    int calculateTax(int orderAmount, int taxPercent);
}
