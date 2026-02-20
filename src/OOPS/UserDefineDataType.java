package OOPS;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserDefineDataType {
    public static  class Student{// class ek khudka ek datatype bana liya hai
        String name;
        int rollno;
        double cpga;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // First object
        Student s1 = new Student();// Declaration of object
        s1.name = "Priyanshu ";
        s1.rollno= 105;
        s1.cpga = 8.26;

        //
        Student s2 = new Student();// declaration
        s2.name = " RAJ ";
        s2.rollno= 108;
        s2.cpga = 7.5;

        Student s3 = new Student();
        s3.name = "Parth";
        s3.rollno= sc.nextInt();
        s3.cpga = 8.95;


      //  System.out.println(s3.rollno);
       // System.out.println(s3.name);
       // System.out.println(s3.rollno);



    }
}
