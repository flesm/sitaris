package part1;

// KL13 ад AKL
public class GiftOrder extends OrderBase {
    @Override
    public int processOrder(int orderId) {
        return orderId;
    }

    @Override
    public int checkIngredients(int ingredientId, int quantity) {
        return ingredientId * quantity;
    }

    public String wrapGift(String message) {
        return "Gift wrapped with message: " + message;
    }
}
