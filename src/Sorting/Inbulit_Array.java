package Sorting;

import java.util.Scanner;
import java.util.*;

public class Inbulit_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={10,5,0,15,20,11};
        Arrays.sort(arr,0,3);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
