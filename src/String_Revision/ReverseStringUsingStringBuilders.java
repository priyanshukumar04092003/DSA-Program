package String_Revision;

import java.util.Scanner;

public class ReverseStringUsingStringBuilders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "priyanshu";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String str1=sb.toString();
        System.out.println(str1);
    }
}
