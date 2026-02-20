package OOPS;

import java.util.Arrays;

public class ConstructorMarks2 {
    public static class StudentData{
        int marks [];
        String name;

//        // Shallow Copy of Array

//        StudentData(int [] xyz){
//           marks=xyz;
//        }

        // Deep copy of Array
        StudentData(int [] abc,String s ){
           marks = Arrays.copyOf(abc,abc.length);// Deep copy karne ka tarika hai.
        }

        void print(){
           // System.out.print(marks[0]+" "+marks[1]+" "+marks[2]+" "+marks[3]);
            System.out.println(marks[0]);
        }
    }
    public static void main(String[] args) {
         int [] arr =  {72,77,78,79,80};
//        StudentData s = new StudentData(arr);
//        s.marks[0]=91;
//        System.out.println(arr[0]);

        StudentData s2 = new StudentData(arr,"priyanshu");

        s2.marks[0]=88;
        System.out.println(arr[0]);

    }
}

// Isko hmlog bolte hai shallow copy. agr hmlog koi bhi aaray mein
// changes karte hai toh dono aaray mein changes aata hai.

// aagr aaisa nhi chahate hai toh deep copy bana hoga ishse kya hota hai
// kisi bhi  aaray mein changes karte hai toh dono mein changes nhi hoga .

// deep copy karne ke liye ka tarika hota hai
//    Arrays.copyOf(s,s.length);
// agr constuctor se copy kar rhe h toh constructor mein jo aaray hoga wo wala aayega.







