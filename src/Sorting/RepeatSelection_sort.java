package Sorting;

import java.util.Scanner;

public class RepeatSelection_sort {
    public static void Slection_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                 }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={10,2,3,11,15,6,0,7};
        Slection_sort(arr);
    }
}
