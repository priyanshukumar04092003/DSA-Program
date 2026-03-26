package String_Revision;

import java.util.Scanner;

public class BuiltInMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Priyanshu kumar";
        System.out.println(str.indexOf(' '));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());


        System.out.println(str.contains("riya"));
        System.out.println(str.startsWith("Priya"));
        System.out.println(str.endsWith("mar"));

        // compare To : Do String ko Lexographically compare karta h .
        // jo string dictornay mein phele aata h wo string chhota hota hai





    }

}
