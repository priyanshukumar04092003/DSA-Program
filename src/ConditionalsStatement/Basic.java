package ConditionalsStatement;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //    System.out.print("Enter the salary:");
//        float sal =sc.nextInt();
//        float tax;
//        if(sal<500000){
//            System.out.println("tax is 0%");
//        }
//        else if(sal>=500000 && sal<=1000000){
//            System.out.println("tax is 20%:"+(sal*0.2));
//        }
//        else{
//           System.out.println("Tax is 30%:"+(sal*0.3));
//        }
//        int a=sc.nextInt();
//        int b= sc.nextInt();
//        int c= sc.nextInt();
//        if(a>b && a>c){
//            System.out.println("A is greatest.");
//        }
//        else if(b>a && b>c){
//            System.out.println("B is greatest.");
//        }
//        else{
//            System.out.println("C is greatest.");
//        }
       int marks=sc.nextInt();
//       String y=(x%2==0)?"even":"odd";
//       System.out.println(y);
    String s=(marks>33)?"pass":"fail";
    System.out.print(s);
    }
}
