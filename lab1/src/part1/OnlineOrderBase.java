package part1;

// AKL11 ад I5 і I4
public abstract class OnlineOrderBase implements DiscountCalculator, NotificationSender {
    @Override
    public abstract int processOrder(int orderId);

    @Override
    public abstract int calculateDiscount(int orderAmount, int discountPercent);

    @Override
    public abstract void sendNotification(String message);
}
