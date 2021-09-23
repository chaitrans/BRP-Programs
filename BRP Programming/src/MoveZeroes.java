public class MoveZeroes {
    public static void main(String[] args) {
        int arr[] = {0,0,1,0,3,0,5,0,6};
        moveZeroes(arr);
    }
    static void moveZeroes(int[] arr){
        int len = arr.length;
        int count = 0;

        //Traversing an array
        for(int i = 0; i<len; i++){              // 0<9 T     1<9 T    2<9 T
            if(arr[i]!=0){                      //arr[0]!=0 F   arr[1]!=0 F arr[2]!=0 T
                arr[count++]=arr[i];            //arr[0]=arr[2]=>1;
            }
        }

        while(count<len){
            arr[count++]=0;
        }

        for(int j = 0;j<len;j++){
            System.out.print(arr[j] +" ");
        }
    }
}