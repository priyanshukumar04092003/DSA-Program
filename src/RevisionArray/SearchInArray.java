package RevisionArray;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {10,20,30,40,50};
        int n= arr.length;
        int x= sc.nextInt();
        boolean flag = false;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("element is present at index"+" "+i);
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Element is not present in the array");
        }
    }
}
