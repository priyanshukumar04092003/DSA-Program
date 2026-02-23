package SortingRevision;

import java.util.Scanner;
// Selection Sort mein kya karnge jo bhi given array diya hoga usmein se jabse
// smallest element ko find karnge then usko fisrt element of array se replace kar denge

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 2, -3, 1, 22, 7, 9, 1, 7};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int samllest_ele=Integer.MAX_VALUE;
            int minIndex=-1;
            for(int j=i;j<n;j++){
                if(arr[j]<samllest_ele){
                    samllest_ele=arr[j];
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        for (int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
