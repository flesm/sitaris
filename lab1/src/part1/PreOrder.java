package part1;

// KL15 ад I8, AKL9 і I10
public class PreOrder extends SubscriptionOrderBase implements OrderValidator, TaxCalculator {
    @Override
    public String processPayment(String paymentMethod) {
        return "Pre-order payment processed using: " + paymentMethod;
    }

    @Override
    public int validateOrder(int orderId, int status) {
        return status == 1 ? orderId : -1;
    }

    @Override
    public int processOrder(int orderId) {
        return orderId;
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
    public int checkIngredients(int ingredientId, int quantity) {
        return ingredientId * quantity;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to: " + message);
    }
}
