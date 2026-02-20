package Function;

import java.util.Scanner;

public class DecimalToBinary {
    public static void decTobin(int n){
        int binary=0;
        int pow=0;
        while(n>0){
            int rem=n%2;
            binary=binary+(rem*(int) Math.pow(10,pow));
              pow++;
              n=n/2;
        }
        System.out.print(binary);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        decTobin(n);
    }
}
