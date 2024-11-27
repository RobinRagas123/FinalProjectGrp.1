
package finalprojectv.pkg5.pkg4;

import java.util.Scanner;

public class FinalPRojectv54 {
    
    //Legend:
    //prin   -> principal amount
    //monpay -> monthly payment
    //nop    -> number of payments
    //bal    -> balance
    //intpay -> interest pay
    //i      -> interest rate
    //pripay -> principal pay
    
    public static void main(String[] args) {
      Scanner sc = new Scanner  (System.in);
      int main = 0;
      do {
          
           System.out.println(" ~ Amortization Schedule Program ~ ");
           System.out.println("Select a mode: ");
           System.out.println("1: Balance");
           System.out.println("2: Interest Paid");
           System.out.println("3: Principal Pay");
           System.out.println();
           int mode = sc.nextInt();
           System.out.println();
              switch (mode) {
              case 1 ->                   {
                  
                      System.out.println("Enter Principal amount: ");
                      double prin = sc.nextDouble();
                      System.out.println("Enter Monthly payment: ");
                      double monpay = sc.nextDouble();
                      System.out.println("Enter number of payments: ");
                      int nop = sc.nextInt();
                      double bal = prin - (monpay * nop);
                      System.out.println("Balance is: " + bal);
                      System.out.println();
                      System.out.println("Try again.");
                      System.out.println();
                      
                  }
              case 2 ->                   {
                  
                      System.out.println ("Enter balance: ");
                      double bal = sc.nextDouble();
                      System.out.println("Enter monthly interest rate: ");
                      double i = sc.nextDouble();
                      double intpay = bal * i;
                      System.out.println("Interest pay: " + intpay);
                      System.out.println();
                      System.out.println("Try again.");
                      System.out.println();
                      
                  }
              case 3 ->                   {
                  
                      System.out.println("Enter Monthly payment: ");
                      double monpay = sc.nextDouble();
                      System.out.println("Enter Interest paid: ");
                      double intpay = sc.nextDouble();
                      double pripay = monpay - intpay;
                      System.out.println("Principal Pay: " + pripay);
                      System.out.println();
                      System.out.println("Try again.");
                      System.out.println();
                  }
              default -> {
                  
                  System.out.println("Invalid Mode, Try Again.");
                  System.out.println();
                  
              }
          }
      }
      while (main == 0);
    }
    
}
