package BIT_WISE_OPERATOR.java;

import java.util.Scanner;

public class Count_NumberOf_setBits {
    public static void Count_SETBITS(int n){
        int count=0;
        while(n!=0){
            int lsb=n&1;
            if(lsb==1){
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Count_SETBITS(n);
    }
}
