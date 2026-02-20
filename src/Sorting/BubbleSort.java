package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void bubble_sort(int arr[]){
        int temp=0;
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={10,8,9,11,13,0,7};
        bubble_sort(arr);
    }
}
