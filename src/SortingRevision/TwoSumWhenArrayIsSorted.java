package SortingRevision;

import java.util.Scanner;

public class TwoSumWhenArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] ={0,10,11,77,81,90,92};
        int target=90;
        int n=arr.length;
        int i=0;
        int j=n-1;
        int idx=-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                System.out.println("target is present at index"+" "+i+" "+j+" ");
                idx++;
                break;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }else{
                j--;
            }
        }
        if(idx==-1) {
            System.out.println("Target is not achive ");
        }
    }
}
