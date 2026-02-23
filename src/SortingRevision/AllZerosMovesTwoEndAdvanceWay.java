package SortingRevision;

import java.util.Scanner;

public class AllZerosMovesTwoEndAdvanceWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] ={1,0,2,0,5,-5,0,7,9,0,11,2,-1,7};
        int n = arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
