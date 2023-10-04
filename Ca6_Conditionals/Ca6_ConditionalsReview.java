package Ca6_Conditionals;

public class Ca6_ConditionalsReview {
  boolean isFilled;
  double billAmount;
  String shipping;

  public Ca6_ConditionalsReview(boolean filled, double cost, String shippingMethod) {
    if (cost > 24.00) {
      System.out.println("High value item!");
    } else {
      System.out.println("Low value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }

  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
    } else {
      System.out.println("Order not ready");
    }

    double shippingCost = calculateShipping();

    System.out.println("Shipping cost: ");
    System.out.println(shippingCost);
  }

  public double calculateShipping() {
    double shippingCost;
    switch (shipping) {
      case "Regular":
        shippingCost = 0;
        break;
      case "Express":
        shippingCost = 1.75;
        break;
      default:
        shippingCost = .50;
    }
    return shippingCost;
  }

  public static void main(String[] args) {
    // create instances and call methods here!
    Ca6_ConditionalsReview book = new Ca6_ConditionalsReview(false, 9.99, "Express");
    Ca6_ConditionalsReview boardGame = new Ca6_ConditionalsReview(true, 21.99, "Express");
    Ca6_ConditionalsReview car = new Ca6_ConditionalsReview(true, 25989.0, "By Hand");
    Ca6_ConditionalsReview computer = new Ca6_ConditionalsReview(true, 14999.0, "Regular");
    book.ship();
    boardGame.ship();
    car.ship();
    computer.ship();
  }
}

// My role in this review exercise was to fill out the otherwise blank main() method to create instances of the Order class and call the ship() method on them so that it utilised every possible conditional path.
