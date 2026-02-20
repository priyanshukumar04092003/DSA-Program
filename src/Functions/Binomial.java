package Functions;

import java.util.Scanner;

public class Binomial {
    public static void Biomials(int num1,int num2){
        int Fact=1;
        for(int i=1;i<=num1;i++){
            Fact=Fact*i;
        }
        int Fact1=1;
        for(int i=1;i<=num2;i++){
            Fact1=Fact1*i;
        }
        int num=num1-num2;
        int Fact2=1;
        for(int i=1;i<=num;i++){
            Fact2=Fact2*i;
        }
        int nMr=Fact1*Fact2;
        int ncr=Fact/nMr;
        System.out.println("The requried Binomials Factorial is"+" "+ncr);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int r= sc.nextInt();
        Biomials(n,r);
    }
}
