package Sorting;

import java.util.Scanner;

public class Insertion_sort {
    public static void Insertion_Sort(int arr[]) {
        for (int i = 1; i < arr.length ; i++) {
            int curr = arr[i];
            int prev = i-1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={10,2,11,7,8,21,5,105,108};
        Insertion_Sort(arr);
    }
}
