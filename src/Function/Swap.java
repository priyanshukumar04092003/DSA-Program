package Function;

import java.util.Scanner;

public class Swap {
    public static void reverse(int num1,int num2){
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println(num1);
        System.out.println(num2);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextByte();

        reverse(a,b);




    }
}
