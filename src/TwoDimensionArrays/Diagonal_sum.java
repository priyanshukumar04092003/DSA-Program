package TwoDimensionArrays;

import java.util.Scanner;

public class Diagonal_sum {
    public static void Dig_sum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum=sum+matrix[i][j];
                }
            }
        }

        int sum1=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i+j==matrix.length-1){
                    sum1=sum1+matrix[i][j];
                }
            }
        }
        int total_dig_sum=sum+sum1;

        System.out.println("The requried diagonal sum is"+" "+total_dig_sum);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
//        int sum=0;
//        for(int i=0;i<matrix.length;i++){
//           for(int j=0;j<matrix[0].length;j++){
//               if(i==j){
//                   sum=sum+matrix[i][j];
//               }
//           }
//        }
        Dig_sum(matrix);


    }
}
