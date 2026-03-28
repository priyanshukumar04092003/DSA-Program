package String_Revision;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Anagram ka mtlb ye hota  Agr kisi word ko jumble kar do
        //mtlb  (aage piche kar do) toh ye dursa word bann jaye to wo anagram
        // hota hai.
                      // Example:
        // slient  ko hmlog jumble kar denge toh wo listen .bann jayega isska slient anagram hai.
        // care ----> race
        //latent ----> talent
        // last -----> salt
        // ye sab anagram hai

        String str1 = "last";
        String str2 = "slat";

        if(str1.length()!=str2.length()){
            System.out.println("String are not Anagram");
        }
        char [] ch = str1.toCharArray();
        char [] ch1 = str2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        String s = new String(ch);
        String  s1 = new String(ch1);

        if(s.equals(s1)){
            System.out.println("The Given String is Anagram");
        }else{
            System.out.println("The given string is not Anagram");
        }



    }
}
