package Function;

import java.util.Scanner;

public class product {
//     public static int product(int num1,int num2){
//        int products= num1*num2;
//        return products;
//    }
    public static void add(){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int sum =a+b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        product(a,b);
//        int products=product(a,b);
//        System.out.println(products);
        add();
    }
}
