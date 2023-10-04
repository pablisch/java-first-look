package Ca6_Conditionals;

public class Order3 {
  boolean isFilled;
  double billAmount;
  String shipping;

  public Order3(boolean filled, double cost, String shippingMethod) {
    if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
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
    // declare conditional statement here
    if (shipping == "Regular") {
      return 0;
    } else if (shipping == "Express") {
      return 1.75;
    } else {
      return 0.50;
    }
  }

  public static void main(String[] args) {
    // do not alter the main method!
    Order3 book = new Order3(true, 9.99, "Express");
    Order3 chemistrySet = new Order3(false, 72.50, "Regular");

    book.ship();
    chemistrySet.ship();
  }
}

// The calculateShipping() method has a conditional statement that checks the value of the shipping field and returns a value that is used in the ship() method.
// The ship() method is called on instances of the Order class on lines 42 and 43.

// The output of this program is poorly designed from a UX perspective.
// High value item!
// Shipping
// Shipping cost: 1.75
// Order not ready

// The output should clarify what item it is giving a message for and the 'shipping' line needs a colon after it.