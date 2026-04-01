package RevisionTwo_Dimension_Arrays;

import java.util.Scanner;

public class PrintArrayInSnakePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]={{1,2,3},{3,4,1},{2,7,8},{2,9,0}};
        for(int i=0;i< arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int j=arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
