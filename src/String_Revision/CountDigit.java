package String_Revision;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String str="";
//        str=str+n;
//        int count=str.length();
//        System.out.println(count);
//        String str= Integer.toString(n);
//        int digit=str.length();
//        System.out.println(digit);

        // convert Double into String
        Double d= sc.nextDouble();
        String str2="ATUL";
        str2=str2+d;
//        String str1 = Double.toString(d);
        System.out.println(str2);

        // Important point agr String ko Integer mein convert karna hai
        // Integer.parseInt  method ka use karte hai .

        String st = "96908211";
        int n = Integer.parseInt(st);
        System.out.println(n);
    }
}
