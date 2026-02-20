package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static int find(int num[],int search){
        for(int i=0;i<num.length;i++){
            if(search==num[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of an  arrays:");
        int num[]=new int[5];
        for(int i=0;i<num.length;i++){
            num[i]= sc.nextInt();
        }
        System.out.println("Enter the search element:");
        int search= sc.nextInt();
        int index=find(num,search);

        if(index==-1){
            System.out.println("Element is not found");
        }else{
            System.out.println("Element is found at index"+" "+index );
        }
    }
}
