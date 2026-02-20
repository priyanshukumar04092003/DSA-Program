package Function;

import java.util.Scanner;

public class gunah {
    public static  int product(int a,int b){
        int multiple=a*b;
        return multiple;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        product(a,b);
        int multiple=product(a,b);
        System.out.println(multiple);

    }
}
