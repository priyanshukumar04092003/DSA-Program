package Arrays;

import java.util.Scanner;

public class MinmumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[]={10,11,13,15,12,5,9,-12};
        int Min=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]<Min){
                Min=num[i];
            }
        }
        System.out.println(Min);
    }
}
