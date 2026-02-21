package ArraysRevision;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // insert the element in the ArrayList at the end position.
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
//     insert the element in the given
        arr.add(3,100);

        // access the element in the ArrayList
        System.out.println(arr.get(3));

        // ArrayList ko Modify karne ke liye  yaa bol sakte wo ArrayList ko update karne ke liye set() ka use karte hai
           arr.set(3,7);

        // size of ArrayList
        int n =arr.size();


        // print the Full ArrayList
            System.out.println(arr);

        // 2nd way to print the ArrayList
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
        //
        arr.add(3,100);
        System.out.println();

        // 3rd way by  ForEachLoop
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        // Remove the element from  the given index
        arr.remove(3);
        arr.remove(arr.size()-1);

        System.out.println(arr);

        // Reverse the ArrayList
            Collections.reverse(arr);
        System.out.print(arr);
    }
}
                     // NOTE IN ArrayList
// ArrayList are dyanamic array ,dynamic basiclly changes in nature. or growing array. .
// those  array that are changes in nature  are called arraylist.
// dynamic array wo array  hota hai iska size badtha rahta hai.
// array mein ek problem hota hai ki uska size fix rahta hai ushi ko
//  problem ko thik karne ke liye arrayList ka use karte hai.
// ArrayList mein agr  element ko insert karna hai toh arr.add() se hota.
// ArrayList mein agr elemnt ko print karna toh arr.get(idx); likhte hai idx=index.
// ArrayList mein element ka valu









