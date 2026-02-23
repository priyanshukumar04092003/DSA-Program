package SortingRevision;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={-46,-16,-4,0,7,10};
        int n= arr.length;
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=arr[i]*arr[i];
        }
        for(int ele:arr1){
            System.out.print(ele+" ");
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr1[j]>arr1[j+1]){
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        System.out.println();
        for(int ele1:arr1){
            System.out.print(ele1+" ");
        }
    }
}
