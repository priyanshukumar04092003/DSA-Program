package ConditionalsStatement;

import java.util.Scanner;

public class calculators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=10;
        int b=20;
        char ch= sc.next().charAt(0);
        switch(ch){
            case '+':System.out.println(a+b);
            break;
            case'-':System.out.println(a-b);
                break;
            case'/':System.out.println(a/b);
                break;
            case'*':System.out.println(a*b);
                break;
            default:System.out.println("Ivalid operation");
        }
    }
}
