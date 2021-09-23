import java.util.Scanner;

public class EvenOddWithoutMod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to Check Even or Odd");
        int num = scanner.nextInt();
        int result = ((num/2)*2);   // (8/2)*2=8
        if(result == num){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}