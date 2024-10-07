package part1;

// KL12 ад AKL
public class ExpressDeliveryOrder extends OrderBase {
    @Override
    public int processOrder(int orderId) {
        return orderId;
    }

    @Override
    public int checkIngredients(int ingredientId, int quantity) {
        return ingredientId * quantity;
    }
}
