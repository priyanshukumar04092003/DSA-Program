package Loops;

import java.util.Scanner;

public class HomeWorksQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum=0;
        int oddSum=0;
        while(true){
            System.out.print("Enter the NUmber:");
            int n= sc.nextInt();
            if(n%2==0){
                evenSum=n+evenSum;
            }else{
                oddSum=n+oddSum;
            }
            System.out.println("The sum of even no is:"+evenSum);
            System.out.println("The Sum of odd no is:"+oddSum);
        }

    }
}
