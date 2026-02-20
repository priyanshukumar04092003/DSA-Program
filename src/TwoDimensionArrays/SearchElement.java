package TwoDimensionArrays;

import java.util.Scanner;

public class SearchElement {
    public static boolean search(int arr[][],int key){
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.print("The elemnent is found at index"+" "+"("+i+" "+j+")");
                    found=true;
                }
            }
        }
        if(found == false){
            System.out.print("Not found");
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int key= sc.nextInt();
        search(arr,key);

    }

}
