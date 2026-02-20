package Strings;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        char ch[]={'a','b','c','d','e'};
//        String str="abcde";
//        String str1=new String("xyz");
//
//        System.out.println(str);
//        System.out.println(str1);
//
//        String name;
//        name= sc.nextLine();

       // System.out.println(name);

//        String name;
//        name=sc.nextLine();
//        System.out.println(name.length());

        String str="priyanshu";
//        String str2="kumar";
//        String Name=str+" "+str2;
//        System.out.println(Name);

        System.out.println(str.charAt(1));

        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i)+" ");
        }
    }
}
