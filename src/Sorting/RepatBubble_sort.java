package Sorting;

import java.util.Scanner;

public class RepatBubble_sort {
    public static void Bubble_sort(int arr[]){
        int temp=0;
        for(int turn=0;turn<=arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={10,2,3,21,55,7,11,18};
        Bubble_sort(arr);
    }
}
