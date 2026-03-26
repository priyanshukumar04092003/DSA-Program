package String_Revision;

import java.util.Scanner;

public class CompareTwoStrings {
    public static boolean equals(String str, String str1){
        if(str.length()!=str1.length()){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str1.charAt(i)){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String("priya");
        String str1 = new String("priyanshu");
        System.out.println(equals(str,str1));



    }
}
