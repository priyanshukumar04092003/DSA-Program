package TwoDimensionArrays;

import java.util.Scanner;

public class LargesandSmallestNo {
    public static void Number(int arr[][]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                largest=Math.max(arr[i][j],largest);
                smallest=Math.min(arr[i][j],smallest);
            }
        }
        System.out.println("The largest element is"+" "+largest);
        System.out.println("The smallest element is"+" "+smallest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        Number(arr);
    }
}
