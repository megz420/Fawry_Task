public class Customer {
    private double balance;
    private Cart cart = new Cart();

    public Customer(double balance) {
        this.balance = balance;
    }

    public Cart getCart() {
        return cart;
    }

    public double getBalance() {
        return balance;
    }

    public void deductBalance(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }
}
