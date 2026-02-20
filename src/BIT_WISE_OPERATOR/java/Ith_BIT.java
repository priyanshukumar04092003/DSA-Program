package BIT_WISE_OPERATOR.java;

import java.util.Scanner;

public class Ith_BIT {
    public static void find_bit(int n,int i){
        int bitmask=(1<<i);
        if((n&bitmask)==0){
            System.out.println(0);
        }else{
            System.out.println(1);

        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=13;
        int i=1;
        find_bit(n,i);

    }
}
