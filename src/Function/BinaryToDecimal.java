package Function;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void decimal(int n){
        int dec=0;
        int pow=0;
        while(n>0) {
            int lastdigit = n % 10;
            dec=dec+(lastdigit*(int) Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.print("The requried decimal No is:"+" "+dec);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary Number:");
         int n =sc.nextInt();
         decimal(n);
    }
}
