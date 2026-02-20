package RevisionArray;

import java.util.Scanner;

public class RotateArrayFromRightSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array clockwise rotate hoga.
        int [] arr= {10,20,30,40,50};
        int n= arr.length;
        int d= sc.nextInt();
        int k=0;
        int[] arr1 = new int[n];
        for(int i = n-d; i<n; i++){
            arr1[k++]=arr[i];
        }
        for(int i=0;i<n-d;i++){
            arr1[k++]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=arr1[i];
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
