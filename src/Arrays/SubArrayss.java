package Arrays;

import java.util.Scanner;

public class SubArrayss {
    public static  void SUBARRAY(int num[]){
        //int sum=0;
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");
                   currSum=currSum+num[k];
                   if(currSum>maxSum){
                       maxSum=currSum;
                   }
                }
                currSum=0;
                System.out.println();
            }
           // System.out.println();
        }
        System.out.println("The Requried maxSum is"+" "+maxSum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[]={10,20,30,40,50};
        SUBARRAY(num);
    }
}
