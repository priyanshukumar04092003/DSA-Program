package String_Revision;

import java.util.Scanner;
import java.util.Arrays;

public class Most_Frequent_Charcter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String str = "abczyacdefsjsjsjsjsjsssqa";
       char [] arr = str.toCharArray();
       Arrays.sort(arr);

       // Sliding Window. Concept bhuth important hai interview se basis se.
        int i=0;
        int j=0;
        char ans=arr[i];
        int max_freq=-1;
        int n=str.length();

        while(j<n){
            if(arr[i]==arr[j]){
                j++;
            }else{
                int freq=j-i;
                if(freq>max_freq){
                    max_freq=freq;
                    ans=arr[i];
                }
                i=j;
            }
        }
        // yaha pe dubara isliye  freq or max greq nikal rhe kyu jab arr[i]==arr[j] to
        // loop tut jayega or last wala  mast_freq nhi print hoga.
        int freq=j-i;
        if(freq>max_freq){
            max_freq=freq;
            ans=arr[i];
        }

        System.out.println(ans+" ");
    }
}
