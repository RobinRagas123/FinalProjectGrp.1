
package pkgfinal.project.v.pkg5;

import java.util.Scanner;

public class FinalProjectV5 {

    public static void main(String[] args) {
       Scanner sc = new Scanner  (System.in);
       int main = 0;
       do{
           System.out.println("Amortization schedule");
           System.out.println("Select a mode: ");
           System.out.println("1: Balance");
           System.out.println("2: Interest Paid");
           System.out.println("3: Principal Pay");
           System.out.println();
           int mode = sc.nextInt();
            if (mode == 1){
                 System.out.println("Enter Principal amount: ");
          double prin = sc.nextDouble();
          System.out.println("Enter Monthly payment: ");
          double monpay = sc.nextDouble();
          System.out.println("Enter number of payments: ");
          int nod = sc.nextInt();
          double bal = prin - (monpay * nod);
          System.out.println("Balance is: " + bal);
                System.out.println("Try again?");
                String decide = sc.nextLine();
                    if (decide == Y){
                        while (main == 0);
                    } else if (decide == N) {
                        System.out.println("Thank you for trying our prototype!");
                    }
            } else if (mode == 2){
                System.out.println ("Enter balance: ");
          double bal = sc.nextDouble();
          System.out.println("Enter monthly interest rate: ");
          double i = sc.nextDouble();
          double interpay = bal * i;
          System.out.println("Interest pay: " + interpay);
            System.out.println("Try Again?")
            String decide =sc.nextLine();
                if (decide == Y){
                    while (main == 0);
                } else if (decide == N){
                    System.out.println("Thank you for trying out prototype!");
                }
            } else if (mode == 3){
                 System.out.println("Enter Monthly payment: ");
          double monpay = sc.nextDouble();
          System.out.println("Enter Interest paid: ");
          double interpay = sc.nextDouble();
          double prinpay = monpay - interpay;
          System.out.println("Principal Pay: " + prinpay);
                System.out.println
            } 
       }
    }
    
}
