package BIT_WISE_OPERATOR.java;

import java.util.Scanner;

public class Clear_I_bits_inRange {
    public static void Clear_in_Range(int n,int i,int j){
        int a=(-1<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        int digit=n&bitmask;
        System.out.println(digit);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=10;
        int i=2;
        int j=4;
        Clear_in_Range(n,i,j);
    }
}
