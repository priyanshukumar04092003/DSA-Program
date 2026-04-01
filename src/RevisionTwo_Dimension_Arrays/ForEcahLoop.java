package RevisionTwo_Dimension_Arrays;

import java.util.Scanner;

public class ForEcahLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]={{1,2,3},{3,4,1},{2,7,8},{2,9,0}};
        for(int i=0;i< arr.length;i++){
             for(int ele :arr[i]){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
