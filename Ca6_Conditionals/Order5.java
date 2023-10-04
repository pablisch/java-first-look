package Ca6_Conditionals;

public class Order5 {
  boolean isFilled;
  double billAmount;
  String shipping;

  public Order5(boolean filled, double cost, String shippingMethod) {
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
    double shippingCost;
    // declare switch statement here
    switch (shipping) {
      case "Regular":
        shippingCost = 0;
        break;
      case "Express":
        shippingCost = 1.75;
        break;
      default:
        shippingCost = 0.5;
    }

    return shippingCost;
  }

  public static void main(String[] args) {
    // do not alter the main method!
    Order5 book = new Order5(true, 9.99, "Express");
    Order5 chemistrySet = new Order5(false, 72.50, "Regular");

    book.ship();
    chemistrySet.ship();
  }
}

// Introduction to switch statements.
// The switch statement appears on lines 29-38.
// The switch statement is a conditional statement that will run a block of code depending on the value of a variable.

// It seems odd in this example to use a double, 'shippingCost', to store the value of the shipping cost when it could be returned directly inside the switch statement.


