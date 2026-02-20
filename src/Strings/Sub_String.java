package Strings;

import java.util.Scanner;

public class Sub_String {
    public static void SubString(String str,int si,int ei){
        String subStr="";
        for(int i=si;i<ei;i++){
            subStr=subStr+str.charAt(i);
        }
        System.out.println(subStr+"");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // String str="priyanshu";
        //int si=0;
       // int ei=5;
       // SubString(str,si,ei);

        // Bulid in Function

        String str1="priyanshu";
        String str2=str1.substring(0,5);
        System.out.println(str2);
    }
}
