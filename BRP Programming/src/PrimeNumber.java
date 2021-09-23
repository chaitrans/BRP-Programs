import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Starting number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Ending Number");
        int num2 = scanner.nextInt();
        System.out.println("Prime numbers between " + num1 + " and " + num2 + " are : ");
        int count;
        for (int i = num1; i <= num2; i++) {
            count = 0;
            for ( int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}