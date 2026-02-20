package Arrays;

import java.util.Scanner;

public class RevOfArray {
    public static void Rev(int num[]){
        int start=0;
        int end= num.length-1;
        int temp;
        while(start<end){
            temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[]={10,20,30,40,50};
        Rev(num);
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
