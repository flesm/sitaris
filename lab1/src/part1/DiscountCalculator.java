package part1;

// I5 ад I1
public interface DiscountCalculator extends OrderProcessor {
    int calculateDiscount(int orderAmount, int discountPercent);
}
