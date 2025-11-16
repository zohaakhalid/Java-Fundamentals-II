import java.util.Scanner;
    public class LabTask04 {
       public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of minutes passed:");
       int N = sc.nextInt(); 
       int hours = N/60;
       int min = N%60;
       System.out.print(hours+":"+min);
   }
  }
      