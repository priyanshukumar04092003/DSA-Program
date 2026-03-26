package String_Revision;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

//        String str  = "";
//        str=str+n;
       // System.out.println(str);
        // ek method hota hai jo integer ko string mein convert karta hai .

        String str =Integer.toString(n);
    }
}
