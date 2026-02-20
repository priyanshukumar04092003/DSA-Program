package Strings;

import java.util.Scanner;

public class palindrome {
    public static void palimdromes(String str){
       for(int i=0;i<str.length()/2;i++){
           if(str.charAt(i)==str.charAt(str.length()-1-i)){
               System.out.println("Palindrome");
               break;
           }else{
               System.out.println("Not Palindrome");
           }
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str="racecar";
        palimdromes(str);
    }
}
