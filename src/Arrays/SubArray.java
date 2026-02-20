package Arrays;

import java.util.Scanner;

public class SubArray {
//    public static void Subarray(int num[]) {
//        int start;
//        int Tsub=0;
//        for (int i = 0; i < num.length; i++) {
//            start = i;
//            for (int j = i; j < num.length; j++) {
//                int end = j;
//                for (int k =i; k <=j; k++) {
//                System.out.print(num[k]+" ");
//                }
//                System.out.println();
//                Tsub++;
//            }
//        }
//        System.out.println(Tsub);
//    }

    public static void Subarray(int num[]){
        int TSA=0;
        int sum=0;
       // System.out.print("Sub Array is");
        for(int i=0;i< num.length;i++){
           // System.out.println("Sub Array is");
            for(int j=i;j<num.length;j++){
                System.out.println("Sub Array is");
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");
                    sum=sum+num[k];
                }
                System.out.println();
                TSA++;
                System.out.println("sum is"+" "+sum);
                sum=0;
            }
        }
        System.out.println(TSA);
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[]={10,20,30,40,50};
        Subarray(num);

    }
}
