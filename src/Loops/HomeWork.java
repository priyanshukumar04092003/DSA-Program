package Loops;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n= sc.nextInt();
        int fact =1;
        for( int i=n-1;i>=1;i--){
           fact=fact*i;
        }
        System.out.println(fact);
    }
}
