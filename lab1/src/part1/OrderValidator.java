package part1;

// I8 ад I2 і I3
public interface OrderValidator extends InventoryChecker, PaymentProcessor {
    int validateOrder(int orderId, int status);
}
