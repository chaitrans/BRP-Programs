public class TrianglePattern {
    public static void main(String[] args) {
        int i, j;
        for(i=1; i<=5; i++){
            for(j=1; j<=5; j++) {
                if (j <= 5-i) {
//        for (i = 1; i <= 4; i++) {
//            for (j = 1; j <= 7; j++) {
//                if (j >= 5 - i && j <= 3 + i) {   //  = 6-i =6-1=5 ,6-2=4,5,6-3=3,4,5 //For Triangle
                    System.out.print("*");
                } else {
                    System.out.print("");
                }
            }
                System.out.println();
        }
    }
}