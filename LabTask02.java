import java.util.Scanner;
     public class LabTask02 {
       public static void main(String[] args) {
       Scanner console = new Scanner(System.in);

       System.out.print("Enter number of students:");
       int N = console.nextInt();
       System.out.print("Enter number of apples:");
       int K = console.nextInt();
       
       int eachStudentgets = K/N;
       int applesleft = K%N;

       System.out.println("Each student gets " + eachStudentgets + " apples");
       System.out.println("Apples left are " + applesleft);
   }
 }