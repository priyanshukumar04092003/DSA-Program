package Arrays;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[]={10,11,14,35,99,13,22,34,88,101};
        int largest=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>largest){
                largest=num[i];
            }
        }
        System.out.println("Largest element is"+" "+largest);

    }
}
