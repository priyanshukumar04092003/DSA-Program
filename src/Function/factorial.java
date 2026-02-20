package Function;

import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact= fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n= sc.nextInt();
        fact(n);
        int fact=fact(n);
        System.out.println( "factorial of Number is"+" "+fact);

    }
}
