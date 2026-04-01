package RevisionTwo_Dimension_Arrays;

import java.util.Scanner;

public class SmallestElementInTwoDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]={{2,3,4,44},{5,4,3,7},{22,41,6,7}};
        int smallest_ele=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            int min=arr[i][0];
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
            if(min<smallest_ele){
                smallest_ele=min;
            }
        }
        System.out.println(smallest_ele);
    }
}
