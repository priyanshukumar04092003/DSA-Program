package RevisionArray;

import java.util.Scanner;

public class QuestionOddEvenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr []= {10,20,30,40,50};
        int n= arr.length;
        //odd index
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]=2*arr[i];
            }else{
                arr[i]=10+arr[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
