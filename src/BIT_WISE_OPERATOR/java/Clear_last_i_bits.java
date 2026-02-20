package BIT_WISE_OPERATOR.java;

import java.util.Scanner;

public class Clear_last_i_bits {
    public static void clear_last_i_bit(int n,int i){
        int bitmask=(-1<<i);
        int digit=n&bitmask;
        System.out.println(digit);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=15;
        int i=2;
        clear_last_i_bit(n,i);
    }
}
