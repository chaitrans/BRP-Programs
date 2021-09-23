/*
Fibonacci Series - Addition of previous 2 numbers.
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a+" "+b);   // 0 1
        int c;

        for (int i  = 0; i<=5; i++){            // i = 0; 0<=5 T
            c = a + b;                          //C=0+1=>1 /C=1+1=>2 /C=1+2=>3 /C=2+3=>5 /C=3+5=>8 /C=5+8=>13
            System.out.println(c);              // 1 // 2 //3 //5 //8
            a = b; //Swapping Valuse            // a = 1;  a=1; a=2; a=3; a=5;
            b = c;                              // b = 1;  b=2; b=3; b=5; b=8;
        }
    }
}