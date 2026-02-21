package ArraysRevision;

import java.util.Scanner;
         // Jo add karne mein number aayega usko String mein return karo mtlb  output jo
        //      hoga usko string mein aayega
public class AddTwoNumbersRepresentedInTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr1 ={1,5,7,3,9,1};
        int [] arr2 ={2,3,5,1};

        int number=0;
        for(int i=0;i<arr1.length;i++){
            number = number*10+arr1[i];
        }
        int number1 = 0;
        for(int i=0;i< arr2.length;i++){
            number1=number1*10+arr2[i];
        }
        int sum=0;
            sum=number+number1;
        String str =String.valueOf(sum);

        System.out.println(str);


    }
}
