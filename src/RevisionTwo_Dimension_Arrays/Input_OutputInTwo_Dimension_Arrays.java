package RevisionTwo_Dimension_Arrays;

import java.util.Scanner;

public class Input_OutputInTwo_Dimension_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int [][] arr = new int [3][3]; //{ {0,0,0} ,{0,0,0} , {0,0,0} } 2D array ko aaise bhi respresnt karte hai
//
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[0].length;j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

        // second way to represnt the 2D array

       // int [][] arr = {{1,2,3,4},{3,5,6,1},{1,9,0,5}};

        // Imporatnt concept ko declare an 2D array.

        int n= sc.nextInt();
        int m= sc.nextInt();
        int sum=0;

        int [][] arr =new int[n][m];

        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]= sc.nextInt();
                sum=sum+arr[i][j];
            }
        }

        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("sum is "+sum);




    }
}
