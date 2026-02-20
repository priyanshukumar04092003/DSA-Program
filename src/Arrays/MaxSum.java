package Arrays;

import java.util.Scanner;

public class MaxSum {
    public static void SubarrysMax(int num[]){
        int sum=0;
        int minsum=Integer.MAX_VALUE;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                for(int k=i;k<=j;k++){
                    sum=sum+num[k];
                    //System.out.print(sum);
                }
                System.out.print(sum);
                if(sum>maxsum){
                    maxsum=sum;
                }
                else if(sum<minsum){
                    minsum=sum;
                }
                System.out.println();
                sum=0;
            }
        }
        System.out.println("Maxsum is "+" "+maxsum);
        System.out.println("Minsum is "+" "+minsum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[]={10,20,30,40,50};
        SubarrysMax(num);

    }
}
