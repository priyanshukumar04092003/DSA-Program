package String_Revision;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i=0;
        int j=str.length()-1;
        boolean pal=true;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else{
                pal = false;
                break;
            }
        }
        if(pal==true){
            System.out.println("palimdrome");
        }
        else{
            System.out.println("Not_palimdrome");
        }
    }
}
