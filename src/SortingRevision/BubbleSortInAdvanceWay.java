package SortingRevision;

import java.util.Scanner;

// optimize code of Bubble Sort.

public class BubbleSortInAdvanceWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr ={50,20,10,40,30,70,60};
        int n= arr.length;
        for(int i=0;i<n-1;i++) {
            boolean IsSorted = true;
            // Hmlog yaha pe check karnge i ke iretaion pura hone pe array sort huya hai ki nhi
            // agr nhi huya hai toh break statement loop ko tor dega then j wale loop pe cahal jaiyega .
            for (int k = 0; k < n - 1; k++) {
                if (arr[k] > arr[k + 1]) {
                    IsSorted = false;
                    break;
                }
            }
            if (IsSorted == false) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
