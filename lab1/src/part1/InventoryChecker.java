package part1;

// I2 ад I1
public interface InventoryChecker extends OrderProcessor {
    int checkIngredients(int ingredientId, int quantity);
}
