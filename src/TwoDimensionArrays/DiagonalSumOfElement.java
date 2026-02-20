package TwoDimensionArrays;

import java.util.Scanner;

public class DiagonalSumOfElement {
    public static void DigSum(int matrix[][]){
        int sum=0;
        int sum1=0;
        //diagonal sum of left to right
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j) {
                    sum = sum + matrix[i][j];
                }
            }
        }

        // diagonal sum of right to left
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i+j==matrix.length-1){
                   sum1=sum1+matrix[i][j];
                }
            }
        }
        int diagonalsum=sum1+sum;
        System.out.println("The requried  both diagonal sum is"+" "+diagonalsum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        DigSum(matrix);
    }
}
