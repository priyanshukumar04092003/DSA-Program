package Arrays;

import java.util.Scanner;

public class RepeatCount_Sorting {
    public static void Count_Sorting(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];

        for(int i=0;i<count.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<arr.length;i++){
            while(count[i]>0){
                arr[j]=i;
                count[i]--;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={10,2,11,4,2,8,6,4,1,3,2,7};
        Count_Sorting(arr);
    }
}
