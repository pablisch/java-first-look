package Ca5_Methods;

public class Store6 {
  // instance fields
  String productType;
  double price;

  // constructor method
  public Store6(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }

  // increase price method
  public void increasePrice(double priceToAdd) {
    double newPrice = price + priceToAdd;
    price = newPrice;
  }

  // get price with tax method
  public double getPriceWithTax() {
    double totalPrice = price + price * 0.08;
    return totalPrice;
  }

  // main method
  public static void main(String[] args) {
    Store6 lemonadeStand = new Store6("Lemonade", 3.75);
    double lemonadePrice = lemonadeStand.getPriceWithTax();
    System.out.println(lemonadePrice);
  }
}

// This exercise is about returning a value from a method.
// In this instance the return value of the getPriceWithTax() method is stored in the variable lemonadePrice on line 29 and then printed to the console on line 30.
