package Ca6_Conditionals;

public class Order4 {
  boolean isFilled;
  double billAmount;
  String shipping;
  String couponCode;

  public Order4(boolean filled, double cost, String shippingMethod, String coupon) {
    if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
    couponCode = coupon;
  }

  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }

  public double calculateShipping() {
    if (shipping.equals("Regular")) {
      return 0;
    } else if (shipping.equals("Express")) {
      // Add your code here
      if (couponCode == "ship50") {
        return 0.85;
      } else {
        return 1.75;
      }
    } else {
      return .50;
    }
  }

  public static void main(String[] args) {
    // do not alter the main method!
    Order4 book = new Order4(true, 9.99, "Express", "ship50");
    Order4 chemistrySet = new Order4(false, 72.50, "Regular", "freeShipping");

    book.ship();
    chemistrySet.ship();
  }
}

// This exercise introduces nested if-then-else statements.
// The nested conditional statement appears on lines 33-37.
