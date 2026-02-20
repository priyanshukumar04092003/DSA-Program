package RevisionArray;

import java.util.Scanner;

public class RightRotationWithoutNewArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {10,20,30,40,50,60,70,80,90,100,110};
        int n= arr.length;
        int d= sc.nextInt();
        int start=n-d;
        int end=n-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        start =0;
        end=n-d-1;
        while(start<end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        start=0;
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
