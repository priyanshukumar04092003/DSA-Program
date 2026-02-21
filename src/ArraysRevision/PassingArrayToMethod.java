package ArraysRevision;

import java.util.Scanner;

public class PassingArrayToMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x[]={10,20,30,40};
         change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] y){
        y[2]=88;
    }
}

//                        I UnderStand the concept.
//    dekho shallowcopy mein kya hota ki aagr hm koi array bana rahe hai or usmein elemnt hai then
//    hm ek new array banye or usmein phle wala array ko store kar rhe iska ye mtlb nhi hai ki ek naya array bana hai
//    second wala array bhi phle wale array ko hi refer kar raha hai.

//                               Inenglish.
//In shallow copy, when we create a new array and assign it to an existing array, it does not create a completely new independent array.
//Instead, the new array just refers to the same memory location as the original array.
//So both arrays point to the same data.
//That means if we modify elements using one reference, the changes will be reflected in the other as well."

          //    Deepcopy Concept
//deepcopy mein kya hota ki agr hm naya array mein phle wale array ko store kiye hai iska mtlb
// ek naya independent aaray bana hai ismein agr modify kare toh phele wale in effect nhi parega

          // Inenglish
//          In deep copy, when we create a new array from an existing array, we create a completely independent copy of the elements.
  //      A new memory location is allocated, and all elements are duplicated.
// So if we modify the new array, it does not affect the original array."


