package ArraysRevision;

import java.util.Scanner;

public class NumberOfZerosAndNumberOfOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // GFG Code Platform
        //Note agr hm array ko 2 baar travers karte hai toh hm
        // TWO pass Solution bolte hai

        int [] arr = {1,0,1,0,1,0,0};
        int start=0;
        int end= arr.length-1;

        while(start<end){
            if(arr[start]==0 && arr[end]==1){
                start++;
                end--;
            }
            else if(arr[start]==1 && arr[end]==0){
                //swap;
                arr[start]=0;
                arr[end]=1;
                start++;
                end--;
            }
            else if(arr[start]==1 && arr[end]==1){
                end--;
            }
            else if(arr[start]==0 && arr[end]==0){
                start++;
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
