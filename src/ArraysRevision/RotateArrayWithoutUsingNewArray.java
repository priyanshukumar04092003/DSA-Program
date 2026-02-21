package ArraysRevision;

import java.util.Scanner;

// optimize code of rotate Array

public class RotateArrayWithoutUsingNewArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {6,8,1,2,4,9,0};
        int d= sc.nextInt();
        int n= arr.length;
        d=d%n;
        int start = d;
        int end = n-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        start=0;
        end=d-1;

        while(start<end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        start =0;
        end=n-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
