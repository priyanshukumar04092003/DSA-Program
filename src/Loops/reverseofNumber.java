package Loops;

import java.util.Scanner;

public class reverseofNumber {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
       // int n= sc.nextInt();
//        int lastno;
//        while(n>0){
//            lastno=n%10;
//            System.out.print(lastno);
//            n=n/10;
//        }
//        while(n>0) {
//            int lastDigit = n % 10;
//            int rev = 0;
//            rev = (rev * 0) + lastDigit;
//            System.out.print(rev);
//            n = n / 10;
//        }
//        int count =1;
//        do{
//            System.out.println("priyanshu kumar");
//            count++;
//        }while(count<=10);
        int n =sc.nextInt();
        int i;
        for(i=0;i<=n;i++){
            if(i==3){
                System.out.println("Loops is exits.");
                break;
            }
            System.out.println(i);
        }

    }
}
