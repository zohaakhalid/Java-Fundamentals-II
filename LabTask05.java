import java.util.Scanner;
   public class LabTask05 {
       public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
 
       double cartonCapacity = 3.78;
       double costperLiter = 0.38;
       double profitperCarton = 0.27;
       System.out.print("Enter amount of milk produced:");
       double milk = console.nextDouble();

       double cartons = milk/cartonCapacity;
       double totalCost = costperLiter * milk;
       double totalProfit = profitperCarton * cartons;

       System.out.println("Total amount of milk produced is : " + milk + " litres");
       System.out.printF("Number of milk cartons required is : " + cartons);
       System.out.println("Cost of producing milk is : " + "$" + totalCost);
       System.out.println("Total profit is : " + "$" + totalProfit);
   }
 }