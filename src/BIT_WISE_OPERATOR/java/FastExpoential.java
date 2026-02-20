package BIT_WISE_OPERATOR.java;

import java.util.Scanner;

public class FastExpoential {
    public static void FAST_EXP(int a,int n){
        int ans=1;
        while(n!=0){
            int lsb=n&1;
            if(lsb==0){
                ans=ans*1;
            }else{
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        //MAM APPORACH.
//        int ans=1;
//        while(n>0){
//            if((n&1)!=0){
//                ans=ans*a;
//            }
//            a=a*a;
//            n=n>>1;
//        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int n= sc.nextInt();
        FAST_EXP(a,n);
    }
}
