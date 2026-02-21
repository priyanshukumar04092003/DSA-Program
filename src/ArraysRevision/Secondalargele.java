package ArraysRevision;

import java.util.Scanner;

public class Secondalargele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {10,36,37,22,44,49,26,49,44};
        int largestele=Integer.MIN_VALUE;
        int seclargesele=Integer.MIN_VALUE;

        for(int i=0;i< arr.length;i++){
            if(arr[i]>largestele){
                largestele=arr[i];
            }
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]>seclargesele && arr[i]!=largestele){
                seclargesele=arr[i];
            }
        }
        System.out.println(seclargesele);
    }
}
