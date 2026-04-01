package RevisionTwo_Dimension_Arrays;

import java.util.Scanner;

public class Find_Row_With_Max_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ush row ko nikalo jiska sum maximum hai hai
       int arr[][]={{2,3,4,5},{9,4,2,1},{7,6,9,2},{1,3,5,8}};
       int maxSum=Integer.MIN_VALUE;
       int row=-1;

       for(int i=0;i< arr.length;i++){
           int sum=0;
           for(int j=0;j<arr[0].length;j++){
               sum=sum+arr[i][j];
           }
           if(sum>maxSum){
               maxSum=sum;
               row=i;

           }
       }
        System.out.println(maxSum+" "+row);


    }
}
