package BIT_WISE_OPERATOR.java;

import java.util.Scanner;

public class Check_Number_two_powerof_n {
    public static void Check_number(int n){
        if((n&(n-1))==0){
            System.out.println("The number is power of 2^n");
        }else{
            System.out.println("Not in power of 2^n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Check_number(n);
    }
}
