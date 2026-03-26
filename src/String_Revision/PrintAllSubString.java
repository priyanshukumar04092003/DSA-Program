package String_Revision;

import java.util.Scanner;

public class PrintAllSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "priyanshu";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}

//            REVISION POINT 
// Important point substring mein jo index lete hai
// usmein end index se ek minus kar ke subdtring print karta hai
// ye java ka rule hai.