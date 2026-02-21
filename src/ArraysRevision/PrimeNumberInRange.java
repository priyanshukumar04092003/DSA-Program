package ArraysRevision;

import java.util.Scanner;

public class PrimeNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=1;i<=100;i++){
            boolean flag = true;

            for(int j=2;j<100;j++){
                if(i%j==0){
                    flag =false;
                }
                break;
            }
            if(flag==true){
                System.out.print(i+" ");
            }
        }
    }
}
