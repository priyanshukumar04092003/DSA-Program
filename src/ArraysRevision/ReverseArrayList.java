package ArraysRevision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        int start =0;
        int end = arr.size()-1;

        while(start<end){
            int temp =arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }

        // collection.reverse se bhi hmlog arraylist ko reverse kar sakte hai.
         Collections.reverse(arr);

        System.out.println();

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }

    }
}
