package Arrays;

import java.util.Scanner;

public class Again {
    public static void pair(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
               // System.out.print("("+num[i]+","+num[j]+")");
               // System.out.print("("+num[i]+","+num[j]+")");
               // System.out.print("("+num[i]+","+num[j]+")");
                System.out.print("("+num[i]+","+num[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[]={10,20,30,40,50};
        pair(num);
    }
}
