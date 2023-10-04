package Ca5_Methods;

public class Ca5_MethodsReview {
  
  int balance;
  int totalDeposits = 0;
  int totalWithdrawals = 0;
  
  public Ca5_MethodsReview(int initialBalance){
    balance = initialBalance;
  }

  public void checkBalance() {
    System.out.println("Hello!");
    System.out.println("Your balance is " + balance);
  }

  public void deposit(int amountToDeposit) {
    balance += amountToDeposit;
    totalDeposits += amountToDeposit;
    System.out.println("You just deposited " + amountToDeposit);
  }

  public int withdraw(int amountToWithdraw) {
    balance -= amountToWithdraw;
    totalWithdrawals += amountToWithdraw;
    System.out.println("You just withdrew " + amountToWithdraw);
    return amountToWithdraw;
  }
  
  public static void main(String[] args){
    Ca5_MethodsReview savings = new Ca5_MethodsReview(2000);
    
    //Check balance:
    savings.checkBalance();
    
    //Withdrawing:
    savings.withdraw(300);
    
    //Withdrawing:
    savings.withdraw(400);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();
    
    System.out.println(savings);
  } 

  public String toString() {
    return "Your savings account has a current balance of £" + balance + ". You have deposited a total of £" + totalDeposits + " and withdrawn a total of £" + totalWithdrawals + ".";
  }      
}

