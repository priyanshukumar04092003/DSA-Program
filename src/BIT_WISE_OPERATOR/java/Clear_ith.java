package BIT_WISE_OPERATOR.java;

import java.util.Scanner;

public class Clear_ith {
    public static void Clear_bit(int n,int i){
        int bitmask=~(1<<i);
        int digit=n&bitmask;
        System.out.println(digit);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=10;
        int i=1;
        Clear_bit(n,i);
    }
}
