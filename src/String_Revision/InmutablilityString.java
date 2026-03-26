package String_Revision;

import java.util.Scanner;

public class InmutablilityString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "priyanshu";
        str =str.substring(0,3)+'a'+str.substring(4);
        System.out.println(str);
    }
}
