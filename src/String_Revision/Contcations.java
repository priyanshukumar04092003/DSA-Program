package String_Revision;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Contcations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String a = "priyanshu";
//        String b = "kumar";
//       // System.out.println(a.concat(b));
//         a= a.concat(b);
//        System.out.println(a);

        String str = "priyanshu";
        str = str+ " kumar ";
        System.out.println(str);

        System.out.println("priyanshu"+10+20);
        System.out.println(10+20+"priyanshu");
        System.out.println(10+"priyanshu"+"20");

    }
}
