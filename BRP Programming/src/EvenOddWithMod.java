import java.util.Scanner;

public class EvenOddWithMod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to Check Even or Odd");
        int num = scanner.nextInt();
        if(num%2 == 0) {
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is odd");
        }
    }
}