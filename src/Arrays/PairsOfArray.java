package Arrays;

import java.util.Scanner;

public class PairsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[]={10,20,30,40,50,60};

        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                System.out.println("("+ num[i]+" "+num[j]+")");
            }
            System.out.println();
        }
    }
}
