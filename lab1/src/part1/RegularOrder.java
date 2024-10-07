package part1;

// KL6 ад I2
public class RegularOrder implements InventoryChecker {
    @Override
    public int processOrder(int orderId) {
        return orderId * 2;
    }

    @Override
    public int checkIngredients(int ingredientId, int quantity) {
        return ingredientId * quantity;
    }
}
