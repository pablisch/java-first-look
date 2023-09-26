public class Ca3_5_CompoundAssignmentOperators {
  public static void main(String[] args) {
    int numCookies = 17;

    // A customer buys 3 cookies
    numCookies -= 3;

    // Another customer buuys half the remaining cookies
    numCookies /= 2;

    // Add your code above
    System.out.println(numCookies);
  }
}

// Compound Assignment Operators

// Java has additional compound assignment operators that are used to make code more concise.

// Operator 	Meaning 	Same As
// += 	Add and assign 	x += 5; 	x = x + 5;
// -= 	Subtract and assign 	x -= 5; 	x = x - 5;
// *= 	Multiply and assign 	x *= 5; 	x = x * 5;
// /= 	Divide and assign 	x /= 5; 	x = x / 5;
// %= 	Modulo and assign 	x %= 5; 	x = x % 5;

// In the example above, we created a variable numCookies and set it equal to 17. Then, we used the compound assignment operator to subtract 3 from numCookies. Finally, we divided numCookies by 2.
