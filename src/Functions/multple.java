package Functions;

import java.util.Scanner;

public class multple {
    public static int product(int num1,int num2){
        return num1*num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int result= product(a,b);
        System.out.println(result);
    }
}
