public class test {
    
}
// import java.sql.Date;
// import java.util.List;

// public class Product {

//     public String Name;
//     public Float Price;
//     public int Quantity;

//     public Product()
//     {
//         this.Name = null;
//         this.Price = null;
//         this.Quantity = 0;
//     }

//     public Product(String Name , Float Price , int Quantity)
//     {
//         this.Name = Name;
//         this.Price = Price;
//         this.Quantity = Quantity;
//     }

//     public boolean Take(int Amount)
//     {
//         if (Amount > this.Quantity){
//             assert (Amount > this.Quantity) : "Not Available Quantity";
//             return false;
//         }
//         else{
//             this.Quantity -= Amount;
//             return true;
//         }
//     }

// }

// class ExpirableProduct extends Product {
//     public Date ExpiryDate;

//     public ExpirableProduct(String Name , Float Price , int Quantity , Date ExpiryDate)
//     {
//         super.Name = Name;
//         super.Price = Price;
//         super.Quantity = Quantity;
//         this.ExpiryDate = ExpiryDate;
//     }
// }

// class ShippingProduct extends Product {
//     public Float Weight;

//     public ShippingProduct(String Name , Float Price , int Quantity , Float Weight)
//     {
//         super.Name = Name;
//         super.Price = Price;
//         super.Quantity = Quantity;
//         this.Weight = Weight;
//     }
// }

// class Customer {
//     public Float Balance;
//     public List<Product> Cart;
//     public List<Product> AllProducts;

//     public Customer (Float Balance)
//     {
//         this.Balance = Balance;
//         this.Cart = null;
//         this.AllProducts = null;
//     }

//     public boolean Add (String Name , int Amount)
//     {
//         for (Product product : AllProducts) {
//             if (product.Name == Name){
//                 product.Take(Amount);
//                 Cart.add(product);
//             }
//         }
//         assert true:"There is no Product with this name";
//         return false;
//     }
//     public String checkout()
//     {

//     }
// }

// static class Checkout {
//     public Checkout(Customer customer)
//     {
//         .
//     }
// }