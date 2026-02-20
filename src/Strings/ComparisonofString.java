package Strings;

import java.util.Scanner;

public class ComparisonofString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1="TONY";
       // String s2=new String("TONY");
          String s2="TONY";
        if(s1.equals(s2)){
            System.out.println("Equals Strings");
        }else{
            System.out.println("Not Equals Strings");
        }
    }
}
