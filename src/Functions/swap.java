package Functions;

import java.util.Scanner;

public class swap {
    public static void swap(int num1,int num2){
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("value of a is"+" "+num1+" "+"value of b is"+ " "+num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        swap(a,b);
    }
}
