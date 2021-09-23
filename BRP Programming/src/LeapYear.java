import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Year to Check Leap Year or Not : ");
        int year = scanner.nextInt();
        if ((year%400==0)||(year%4==0 && year%100!=0)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}