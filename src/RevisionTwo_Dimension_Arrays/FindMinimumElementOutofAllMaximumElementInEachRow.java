package RevisionTwo_Dimension_Arrays;

import java.util.Scanner;

public class FindMinimumElementOutofAllMaximumElementInEachRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] ={{2,3,4,5,9},{2,5,1,1,2},{2,4,6,1,11},{2,3,5,13,9}};

        int minOfMax=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            int RowMax=arr[i][0];
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>RowMax){
                    RowMax=arr[i][j];
                }
            }
            if(RowMax < minOfMax){
                minOfMax=RowMax;
            }
        }
        System.out.println(minOfMax);


    }
}
