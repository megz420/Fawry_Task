# E-Commerce System (OOP Design)

This project is a solution to the **Fawry Quantum Internship Challenge**.

It implements an object-oriented design for a simplified e-commerce system with core features such as product management, cart handling, expiration checks, and shipping calculations.

---

##  Features

- Define products with:
  - Name, price, and quantity.
  - Optional expiration (e.g., Cheese, Biscuits).
  - Optional shipping (e.g., Cheese, TV) with weight.

- Customers can:
  - Add products to cart (quantity cannot exceed available stock).
  - Perform checkout with:
    - Subtotal calculation
    - Shipping fees
    - Total amount
    - Balance deduction
    - Shipping notice if applicable
  - Error handling for:
    - Empty cart
    - Expired items
    - Out-of-stock items
    - Insufficient customer balance

---

## 🧱 Project Structure

├── Program.java                       # Main testing and demo runner

├── Product.java                       # Base class for all products
├── IExpirable.java                    # Interface for products with expiration
├── IShippable.java                    # Interface for products requiring shipping
├── ExpirableProduct.java              # Product that has an expiry date
├── ShippableProduct.java              # Product that has shipping weight
├── ExpirableShippableProduct.java     # Example of a product that is both expirable and shippable
├── CartItem.java                      # Represents a product added to the cart with quantity
├── Cart.java                          # Manages the list of CartItems and operations
├── Customer.java                      # Represents a customer with balance and cart
├── CheckoutService.java               # Contains checkout logic, validation and shipping
