package TwoDimensionArrays;

import java.util.Scanner;

  public class Repeat_SpiralMatrix {
    public static void Spiral_Matrix(int matrix[][]){
        int startrow=0;
        int endrow=matrix.length-1;
        int startcol=0;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol) {
            //top
            for (int j = startcol; j <=endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }
            //right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }
            //bottom
            if (startrow < endrow) {
                for (int j = endcol - 1; j >= startcol; j--) {
                    System.out.print(matrix[endrow][j] + " ");
                }
            }
            //left
            if (startcol < endcol) {
                for (int i = endrow- 1; i >startrow; i--) {
                    System.out.print(matrix[i][startcol] + " ");
                }
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
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
