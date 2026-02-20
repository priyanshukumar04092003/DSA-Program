package Function;

import java.util.Scanner;

public class printPrimeNo {
    public static boolean check(int n){
        boolean isprime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isprime=false;
            }
        }
        return isprime;
    }
    public static void printPrime(int n){
        for(int i=2;i<=n;i++){
            check(i);
            if(check(i)==true){
                System.out.print(i+" ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printPrime(n);
    }
}
