package RevisionArray;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr []={10,20,30,40,50};
        int n= arr.length;
        int x = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    flag = true;
                    System.out.println("taget found at index"+" "+i+" "+j);
                    break;
                }
            }
            if(flag==false){
                System.out.println("Element is not found");

            }
        }

    }
}
