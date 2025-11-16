import java.util.Scanner;
public class LabTask08 {
  public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int num = console.nextInt();

        int digit1 = num % 10;
        int digit2 = (num / 10) % 10;
        int digit3 = (num / 100) % 10;

        int sum = digit1 + digit2 + digit3;
        System.out.println("The sum of the digits is " + sum);
    }
}