package part1;

public class Main {
    public static void main(String[] args) {
        RegularOrder regularOrder = new RegularOrder();
        ExpressDeliveryOrder expressDeliveryOrder = new ExpressDeliveryOrder();
        GiftOrder giftOrder = new GiftOrder();
        PreOrder preOrder = new PreOrder();
        ComplexOnlineOrder complexOrder = new ComplexOnlineOrder();

        System.out.println("RegularOrder processOrder: " + regularOrder.processOrder(100));
        System.out.println("RegularOrder checkIngredients: " + regularOrder.checkIngredients(10, 5));

        System.out.println("ExpressDeliveryOrder processOrder: " + expressDeliveryOrder.processOrder(200));
        System.out.println("ExpressDeliveryOrder checkIngredients: " + expressDeliveryOrder.checkIngredients(20, 3));

        System.out.println("GiftOrder processOrder: " + giftOrder.processOrder(300));
        System.out.println("GiftOrder checkIngredients: " + giftOrder.checkIngredients(15, 2));
        System.out.println("GiftOrder wrapGift: " + giftOrder.wrapGift("Happy Birthday!"));

        System.out.println("PreOrder processOrder: " + preOrder.processOrder(400));
        System.out.println("PreOrder processPayment: " + preOrder.processPayment("Credit Card"));
        System.out.println("PreOrder validateOrder: " + preOrder.validateOrder(400, 1));
        System.out.println("PreOrder calculateDiscount: " + preOrder.calculateDiscount(1000, 10));
        System.out.println("PreOrder calculateTax: " + preOrder.calculateTax(1000, 15));
        System.out.println("PreOrder checkIngredients: " + preOrder.checkIngredients(25, 6));
        preOrder.sendNotification("Pre-order ready!");

        System.out.println("ComplexOnlineOrder processOrder: " + complexOrder.processOrder(500));
        System.out.println("ComplexOnlineOrder calculateDiscount: " + complexOrder.calculateDiscount(2000, 20));
        System.out.println("ComplexOnlineOrder calculateTax: " + complexOrder.calculateTax(2000, 18));
        System.out.println("ComplexOnlineOrder processPayment: " + complexOrder.processPayment("PayPal"));
        complexOrder.sendNotification("Order confirmation sent!");
    }
}
