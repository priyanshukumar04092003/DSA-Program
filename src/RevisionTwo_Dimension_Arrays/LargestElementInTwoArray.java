package RevisionTwo_Dimension_Arrays;

import java.util.Scanner;

public class LargestElementInTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]={{2,3,4,5,},{2,44,55,11},{22,82,68,91},{11,81,999,100}};
        int max_ele=Integer.MIN_VALUE;

        for(int i=0;i< arr.length;i++){
            int max=arr[i][0];
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            if(max>max_ele){
                max_ele=max;
            }
        }

        System.out.println(max_ele);

    }
}
