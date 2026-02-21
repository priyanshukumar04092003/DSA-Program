package ArraysRevision;

import java.util.Scanner;

public class ReverseParticularEleOfArray {
    public static void main(String[] args) {
        // ishi ko bolte hai two pointer approach

        Scanner sc = new Scanner(System.in);
       int [] arr ={3,19,56,9,83,12,24,85,14};
        int n= arr.length;
//        for(int i=2;i<n-1-i;i++){
//            int j=n-2-i;
//            int temp = arr[i];
//            arr[i]=arr[j];
//            arr[n-2-i]=temp;
//        }
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }


        // Using while Loop
        int start =2;
        int end = n-2;

        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }






    }
}
