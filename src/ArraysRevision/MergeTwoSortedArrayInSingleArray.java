package ArraysRevision;

import java.util.Scanner;

public class MergeTwoSortedArrayInSingleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr1 ={11,22,44,56,77,90,99};
        int [] arr2 ={2,5,7,11,64,77,82,91,105};
        int n= arr1.length;
        int m= arr2.length;
        int [] arr3 = new int [n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                arr3[k++]=arr1[i++];
            } else if(arr1[i]>arr2[j]){
                arr3[k++]=arr2[j++];
            }
        }
        while(i<n){
            arr3[k++]=arr1[i++];
        }
        while(j<m){
            arr3[k++]=arr2[j++];
        }

        for (int ele : arr3) {
            System.out.print(ele+ " ");
        }
    }
}
