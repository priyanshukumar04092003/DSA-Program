package String_Revision;

import java.util.Scanner;

public class PassingStringToMethod {
    public static void change(String x){
        x="priyanshu";
        System.out.println(x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x="raghav";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
// pass by value to the string

