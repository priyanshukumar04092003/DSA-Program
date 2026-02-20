package BIT_WISE_OPERATOR.java;

import java.util.Scanner;

public class Check_Number {
    public static void ODD_EVEN(int n){
      int LSB=n&1;
      if(LSB==0){
          System.out.println("EVEN NUMBER");
      }else{
          System.out.println("ODD NUMBER");
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        ODD_EVEN(n);
    }
}
