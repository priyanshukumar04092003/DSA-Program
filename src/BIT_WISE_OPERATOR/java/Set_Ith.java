package BIT_WISE_OPERATOR.java;

import java.util.Scanner;

public class Set_Ith {
    public static int Set_ith(int n,int i){
      int bitmask=(1<<i);
      int digit=n|bitmask;
      return digit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=10;
        int i=2;
        int number=Set_ith(n,i);
        System.out.println(number);
    }
}
