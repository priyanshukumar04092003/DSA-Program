package ArraysRevision;

import java.util.Scanner;
import java.util.Arrays;

public class SecondMaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = {10,7,3,6,9,2,11};
        Arrays.sort(arr);
        int SecLargest=0;
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]>arr[i-1]){
                SecLargest=arr[i-1];
                break;
            }
        }
        System.out.println(SecLargest);

    }
}
