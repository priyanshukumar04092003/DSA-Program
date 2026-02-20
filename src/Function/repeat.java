package Function;

import java.util.Scanner;

public class repeat {
    public static void hexaTodecimal(int n){
        int lastdigit=n%10;
        int pow=0;
        int dec=0;
        while(n>0){
            dec=dec+(lastdigit* (int)Math.pow(16,pow));
            pow++;
            n=n/10;
        }
        System.out.print("The requried decimal no is"+" "+dec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        hexaTodecimal(n);
    }
}
