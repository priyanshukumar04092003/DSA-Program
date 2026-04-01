package RevisionTwo_Dimension_Arrays;

import java.util.Scanner;

public class PrintTheElementColumnWise {
    public static void main(String[] args) {
       int arr[][]={{1,2,3,4},{2,3,5,6},{9,0,5,6},{2,3,4,5}};
      for(int i=0;i<arr[0].length;i++){
          for(int j=0;j< arr.length;j++){
              System.out.print(arr[j][i]+" ");
          }
          System.out.println();
      }
    }
}
