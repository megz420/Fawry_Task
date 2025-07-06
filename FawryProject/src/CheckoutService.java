import java.util.ArrayList;
import java.util.List;

public class CheckoutService {

    public void checkout(Customer customer) {
        Cart cart = customer.getCart();

        if (cart.isEmpty()) {
            throw new IllegalStateException("Cart is empty");
        }

        double subtotal = 0;
        double shipping = 0;
        List<IShippable> shippables = new ArrayList<>();

        for (CartItem item : cart.getItems()) {
            Product p = item.product;
            
            if (p instanceof IExpirable) {
                if (((IExpirable) p).isExpired()) {
                    throw new IllegalStateException("Product " + p.getName() + " is expired");
                }
            }

            if (p instanceof IShippable) {
                shippables.add((IShippable) p);
                shipping += 15;
            }

            subtotal += item.getTotalPrice();
        }

        double total = subtotal + shipping;

        if (total > customer.getBalance()) {
            throw new IllegalStateException("Insufficient customer balance");
        }

        customer.deductBalance(total);

        // Print Shipping Notice
        if (!shippables.isEmpty()) {
            System.out.println("** Shipment notice **");
            double totalWeight = 0;
            for (IShippable s : shippables) {
                System.out.println(s.getName() + " " + s.getWeight() + "kg");
                totalWeight += s.getWeight();
            }
            System.out.println("Total package weight " + totalWeight + "kg");
        }

        // Print Checkout Receipt
        System.out.println("** Checkout receipt **");
        for (CartItem item : cart.getItems()) {
            System.out.println(item.quantity + "x " + item.product.getName() + " " + item.getTotalPrice());
        }
        System.out.println("----------------------");
        System.out.println("Subtotal " + subtotal);
        System.out.println("Shipping " + shipping);
        System.out.println("Amount " + total);
        System.out.println("Customer Balance: " + customer.getBalance());
    }
}
