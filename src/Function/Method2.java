package Function;

import java.util.Scanner;

public class Method2 {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
          f=f*i;
        }
        return f;
    }
    public static int bio(int n,int r) {
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nMr = fact(n - r);
        return (fact_n/(fact_r*fact_nMr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r= sc.nextInt();
        int binomial=bio(n,r);
        System.out.println(binomial);
    }
}
