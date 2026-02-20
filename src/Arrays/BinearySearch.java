package Arrays;

import java.util.Scanner;

public class BinearySearch {
    public static int binySearch(int num[],int search){
        int start=0;
        int end=num.length-1;
        int mid=(start+end)/2;

        while(start<=end){
            if(num[mid]==search){
                return mid;
            } else if (num[mid]>search){
                end=mid-1;
            }else{
               start=mid+1;
            }
            mid=(start+end)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] =new int [7];
        for(int i=0;i<num.length;i++){
            num[i]= sc.nextInt();
        }
        System.out.println("Enter the search element:");
        int search=sc.nextInt();
        int index=binySearch(num,search);

        if(index==-1){
            System.out.println("Element is not found");
        }else{
            System.out.println("Element is found at index is"+" "+index);
        }

    }
}
