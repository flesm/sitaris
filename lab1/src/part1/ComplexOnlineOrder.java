package part1;

// KL14 ад AKL11 и I10
public class ComplexOnlineOrder extends OnlineOrderBase implements TaxCalculator {
    @Override
    public int processOrder(int orderId) {
        return orderId + 10;
    }

    @Override
    public int calculateDiscount(int orderAmount, int discountPercent) {
        return (orderAmount * discountPercent) / 100;
    }

    @Override
    public int calculateTax(int orderAmount, int taxPercent) {
        return (orderAmount * taxPercent) / 100;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent: " + message);
    }

    @Override
    public String processPayment(String paymentMethod) {
        return "Payment processed: " + paymentMethod;
    }
}
