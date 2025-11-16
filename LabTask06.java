import java.util.Scanner;
   public class LabTask06 {
      public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
  
      double rate = 15.50;
      System.out.print("Enter hours worked per week:");
      double hoursWorked = console.nextDouble();

      double pay = rate * hoursWorked * 5;
      double tax = 0.14;
      double taxRate = pay * tax;
      double payafterTax = pay - taxRate;

      double ca = payafterTax * 0.1;
      double ss = payafterTax * 0.01;
     
      double totalspent = ca + ss;
      double payleft = payafterTax - totalspent;

      double sb = payleft * 0.25;
      double psb = sb* 0.50;

      System.out.println("Pay:" + pay + "$");
      System.out.println("Pay after tax :" + payafterTax + "$");
      System.out.println("Amount spent on clothes:" + ca + "$");
      System.out.println("Amount spent on scool supplies:" + ss + "$");
      System.out.println("Amount spent on saving bonds:" + sb + "$");
      System.out.println("Amount parents spent:" + psb + "$");
      console.close();
   }
 }