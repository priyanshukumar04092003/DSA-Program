package Function;

import java.util.Scanner;

public class primeNumber {
    public static boolean check(int n){
       // if(n==2){
         //   System.out.println("prime Number");
        //}
        boolean primeNo=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
               primeNo=false;
            }
            break;
        }
        return primeNo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        check(n);
        if(check(n)==true){
            System.out.println("prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
