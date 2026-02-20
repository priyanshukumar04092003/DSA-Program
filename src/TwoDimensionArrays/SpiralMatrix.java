package TwoDimensionArrays;

import java.util.Scanner;

public class SpiralMatrix {
    public static void Spiral_Matrix(int matrix[][]){
        int startrow=0;
        int endrow=matrix.length-1;
        int startcolumn=0;
        int endcolumn=matrix[0].length-1;
        while(startrow<=endrow && startcolumn<=endcolumn){
            //top;
            for(int j=startcolumn;j<=endcolumn;j++){
                System.out.print(matrix[startcolumn][j] +" ");
            }
            //right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcolumn]+" ");
            }
            // bottom
           if(startrow < endrow){
                for(int j=endcolumn-1;j>=startcolumn;j--){
                    System.out.print(matrix[endrow][j]+" ");
                }
            }
            //for(int j=endcolumn-1;j>=startcolumn;j--){
              //  System.out.print(matrix[endrow][j]+" ");
            //}
            //left
            if(startcolumn < endcolumn){
                for(int i=endrow-1;i>=startrow+1;i--){
                    System.out.print(matrix[i][startcolumn]+" ");
                }
            }
            startcolumn++;
            endcolumn--;
            startrow++;
            endrow--;

        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][]={{1,2,3,4},
                   {5,6,7,8},
                   {9,10,11,12},
                   {13,14,15,16}};

        Spiral_Matrix(matrix);



    }
}
