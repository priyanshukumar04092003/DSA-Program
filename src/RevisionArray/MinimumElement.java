package RevisionArray;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = {10,20,33,7,5,-2,-11 };
        int n= arr.length;

        int minele= Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]<minele){
                minele=arr[i];
            }
        }
        System.out.println(minele);
    }
}

//          NOTE.
// array out of bound basically ye bolta hai ,agr koi
// galat index ko access kar rha hai yaa print kar raha hai joki
// array mein wo index present nhi hai tab array out of bound
// ho jata hai

