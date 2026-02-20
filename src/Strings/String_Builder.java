package Strings;

import java.util.Scanner;

public class String_Builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb= new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
        // output : abcdefghijklmonpqrstuvwxyz...
    }
}
