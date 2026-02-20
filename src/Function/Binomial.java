package Function;

import java.util.Scanner;

public class Binomial {
    public static int binomial(int n,int r){
        int fact1=1;
        for(int i=1;i<=n;i++){
            fact1=fact1*i;
        }
        int fact2=1;
        for(int i=1;i<=r;i++){
            fact2=fact2*i;
        }
        int diff=(n-r);
        int fact3=1;
        for(int i=1;i<=(n-r);i++){
            fact3=fact3*i;
        }
        return fact1/(fact2*fact3);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N:");
        int n = sc.nextInt();
        System.out.print("Enter the value of R:");
        int r = sc.nextInt();
        binomial(n,r);
        int bio=binomial(n,r);
        System.out.println("The requried Binomial is"+" "+bio);

    }
}
