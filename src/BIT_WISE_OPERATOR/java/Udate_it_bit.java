package BIT_WISE_OPERATOR.java;

import java.util.Scanner;

public class Udate_it_bit {
    public static void Clear_ith_bit(int n,int i) {
        int bitmask = ~(1<<i);
        int digit=n&bitmask;
        System.out.println(digit);
    }
    public static void Set_ith_bit(int n,int i){
        int bitmask=(1<<i);
        int digit=n|bitmask;
        System.out.println(digit);
    }
    public static void update_ith_bits(int n,int i,int newbit) {
        if (newbit == 0) {
            Clear_ith_bit(n, i);
        } else {
            Set_ith_bit(n, i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=10;
        int i=2;
        int newbit=1;
        update_ith_bits(n,i,newbit);
    }
}
