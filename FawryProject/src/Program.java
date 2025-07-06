import java.util.*;

public class Program {

    public static void main(String[] args) {

        ExpirableShippableProduct cheese = new ExpirableShippableProduct("Cheese", 100, 5, getFutureDate(2 ),3);
        ExpirableProduct biscuits = new ExpirableProduct("Biscuits", 150, 3, getFutureDate(1));
        ShippableProduct tv = new ShippableProduct("TV", 300, 2, 5.5);
        ShippableProduct Meat = new ShippableProduct("Meat", 300, 3, 2.4);
        Product scratchCard = new Product("ScratchCard", 50, 10);

        Customer customer = new Customer(1900);

        try {
            customer.getCart().addProduct(cheese, 2);        // 2* Cheese
            customer.getCart().addProduct(biscuits, 1);      // 1* Biscuits
            customer.getCart().addProduct(tv, 1);            // 1* TV
            customer.getCart().addProduct(Meat, 3);          // 3* Meat
            customer.getCart().addProduct(scratchCard, 1);   // 1* ScratchCard
        } catch (Exception e) {
            System.out.println("Error while adding to cart: " + e.getMessage());
        }

        CheckoutService service = new CheckoutService();

        try {
            service.checkout(customer);
        } catch (Exception e) {
            System.out.println("Checkout failed: " + e.getMessage());
        }
    }

    // 🔧 Helper method to get future expiry dates
    public static Date getFutureDate(int daysAhead) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, daysAhead);
        return cal.getTime();
    }
}
