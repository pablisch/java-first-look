package Ca4_Classes;
// should be called, and about, Store. Wherever it says Ca4_2_Constructors, it should say Store.

public class Ca4_2_Constructors {
  // new method: constructor!
  public Ca4_2_Constructors() {
    System.out.println("I am inside the constructor method.");
  }

  // main method is where we create instances!
  public static void main(String[] args) {
    System.out.println("Start of the main method.");

    // create the instance below
    Ca4_2_Constructors lemonadeStand = new Ca4_2_Constructors();
    // print the instance below
    System.out.println(lemonadeStand);
  }
}

// This exercise demonstrates the flow of execution in a Java program.
// The program starts at the main() method, and executes the code inside the main() method.
// The main() method creates an instance of the Store class, printing "I am inside the constructor method.".
// Then returns to the main() method and prints the instance of the Store class.

