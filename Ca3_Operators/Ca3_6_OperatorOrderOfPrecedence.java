package Ca3_Operators;
public class Ca3_6_OperatorOrderOfPrecedence {
  public static void main(String[] args) {

    int expression1 = 5 % 2 - (4 * 2 - 1);
    System.out.println(expression1);

    int expression2 = (3 + (2 * 2 - 5)) + 6 - 5;
    System.out.println(expression2);

    int expression3 = 5 * 4 % 3 - 2 + 1;
    System.out.println(expression3);

    int expression4 = 5 * 4 % 3;
    System.out.println(expression4);

    int expression5 = 5 * (4 % 3) - (2 + 1);
    System.out.println(expression5);

    int expression6 = 4 % 3 * 5 - (2 + 1);
    System.out.println(expression6);

    int expression7 = 24 / 6 % 3 * 13;
    System.out.println(expression7);

  }
}

// Operator order of precedence:
// 1. Parentheses
// 2. Exponents
// 3. Modulo, multiplication and division
// 4. Addition and subtraction

// Within each grouping, operators are evaluated from left to right.
// Therfore, in the expression 12 / 2 * 3, the division happens first, resulting in 6. Then the multiplication happens, resulting in 18.
// In other words, mulitplcation has no higher precedence than division.

