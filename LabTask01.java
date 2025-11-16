import java.util.Scanner;
     public class LabTask01 {
         public static void main(String[] args) {
         Scanner console = new Scanner(System.in);

         System.out.print("Enter a decimal number:");
         double amount = console.nextDouble();
         int cents = (int)(amount*100);
         int dollars = cents/100;
         int rcents = cents%100;
         int quarters = rcents/25;
         int rcents2 = rcents%25;
         int dimes = rcents2/10;
         int rcents3 = rcents2%10;
         int nickels = rcents3/5;
         int rcents4 = rcents3%5;
         
         System.out.println("Total amount is " + amount);
         System.out.println("Total amount in cent is " + cents);
         System.out.println("Total dollars are " + dollars);
         System.out.println("Total quarters are " + quarters);
         System.out.println("Total dimes are " + dimes);
         System.out.println("Total nickels are " + nickels);
         System.out.println("Total pennies are " + rcents4);
     }
   }
