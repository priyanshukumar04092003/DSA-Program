package String_Revision;

import java.util.Scanner;

public class RevrseOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "priyanshu";
        char ch[] = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        // convert the arrayToString
        String str1= new String(ch);
        System.out.println(str1);
    }
}
