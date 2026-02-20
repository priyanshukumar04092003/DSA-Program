package RevisionArray;

import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {10,20,98,40,66};
        int n= arr.length;

//        for(int i=0;i<8;i++){
//            arr[i]= sc.nextInt();
//        }
//
        int maxele = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>maxele){
                maxele=arr[i];
            }
        }
        System.out.println(maxele);
    }
}
