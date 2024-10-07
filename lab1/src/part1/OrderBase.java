package part1;

// AKL ад I2
public abstract class OrderBase implements InventoryChecker {
    @Override
    public abstract int processOrder(int orderId);

    @Override
    public abstract int checkIngredients(int ingredientId, int quantity);
}
