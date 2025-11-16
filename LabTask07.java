import java.util.Scanner;
  public class LabTask07 {
    public static void main(String[] args) {
     Scanner console = new Scanner(System.in);

    System.out.print("Class A tickets sold:");
    int a = console.nextInt();
    System.out.print("Class B tickets sold:");
    int b = console.nextInt();
    System.out.print("Class C tickets sold:");
    int c = console.nextInt();
    System.out.print("Class D tickets sold:");
    int d = console.nextInt();

    
    double incomeA = a*20;
    double incomeB = b*15;
    double incomeC = c*10;
    double incomeD = d*5;
    double total = incomeA + incomeB +incomeC+ incomeD;

    System.out.println("Income from Class A: $" + incomeA);
    System.out.println("Income from Class B: $" + incomeB);
    System.out.println("Income from Class C: $" + incomeC);
    System.out.println("Income from Class D: $" + incomeD);
    System.out.println("Total income: $" + total);
  }
}    