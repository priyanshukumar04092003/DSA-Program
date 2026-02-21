package ArraysRevision;

import java.util.Scanner;

public class MergeTwoSortedArrayFromReverseSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr1 = {1,4,5,7,9};
        int [] arr2 = {2,3,6,8};
        int n = arr1.length;
        int m = arr2.length;
        int [] arr3 = new int[n+m];
        int l= arr3.length;
        int i=n-1;
        int j=m-1;
        int k=l-1;

        while(i>=0 && j>=0){
            if(arr1[i]>=arr2[j]){
                arr3[k--]=arr1[i--];
            }else{
                arr3[k--]=arr2[j--];
            }
        }
        while(i>=0){
            arr3[k--]=arr1[i--];
        }
        while(j>=0){
            arr3[k--]=arr2[j--];
        }

        for(int ele:arr3){
            System.out.print(ele+" ");
        }
    }
}
