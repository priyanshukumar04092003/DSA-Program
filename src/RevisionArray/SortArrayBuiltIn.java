package RevisionArray;

import java.util.Scanner;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={10,2,-4,7,-11,6,91};
        int n = arr.length;
        print(n,arr);
    }
    public static  void print(int n,int [] arr){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
