package Loops;

import java.util.Scanner;

public class MultipeOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while(true){
//            System.out.println("Enter the number:");
//            int n=sc.nextInt();
//            if(n%10==0){
//                System.out.println("Loops is exits.");
//                break;
//            }
//            System.out.println(n);
//        }
//        int i;
//
//        for(i=0;i<=7;i++){
//            if(i==4){
//                continue;
//            }
//            System.out.println(i);
//        }

        while(true){
            System.out.print("Enter the Number:");
            int n= sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }
    }
}
