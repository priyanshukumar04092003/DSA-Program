package BasicProgram;

import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int div=2;
        for(div=2;div<n;div++){
            if(n%div==0){
                System.out.println("not prime");
                break;
            }else{
                System.out.println("prime");
                break;
            }
        }


    }
}
