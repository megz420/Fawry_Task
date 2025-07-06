public class Product {
    protected String name;
    protected double price;
    protected int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public boolean take(int amount) {
        if (amount > this.quantity) return false;
        this.quantity -= amount;
        return true;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
}




