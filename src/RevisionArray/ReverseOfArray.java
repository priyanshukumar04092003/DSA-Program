package RevisionArray;

import java.util.Scanner;

public class ReverseOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {10,20,40,5,8,11,34};
        int n= arr.length;
//        // Using Two Pointer Approach
//        int i=0;
//        int j=n-1;
//        while(j>i) {
//            int temp = arr[j];
//            arr[j] = arr[i];
//            arr[i] = temp;
//            i++;
//            j--;
//        }
//       for(int ele: arr){
//           System.out.print(ele+" ");
//       }


       //Two Pointer Approach Using ForLoop

        for(int i=0;i<n/2;i++){
            int temp =arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
       for(int ele: arr){
           System.out.print(ele+" ");
       }

    }
}
