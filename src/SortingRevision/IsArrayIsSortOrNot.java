package SortingRevision;

import java.util.Scanner;

public class IsArrayIsSortOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,0,3,4,5};
        int n= arr.length;
        boolean IsSort = true;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    IsSort=false;
                    break;
                }
            }
        }
        if(IsSort==false){
            System.out.println("Array is Not Sort");
        }else{
            System.out.println("array is Sort");
        }
    }
}
