package OOPS;

public class MethodInsideClass2 {
    public static  class Student{//Class under hmlog  method bhi bana sakte hai .
        String name;
        int rollno;
        double cgpa;


        //class under Method hai iska matlab jinta bhi
        //object banega issh class ka  sab object se ye Method call ho jayega.

        void print(){
            System.out.println(name+" "+rollno+" "+cgpa+" ");
        }

    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Priyanshu";
        s1.rollno=105;
        s1.cgpa=8.26;

        Student s2 = new Student();
        s2.name="raj";
        s2.rollno=108;
      //  s2.cgpa=7.55;

        Student s3 = new Student();
        s3.name="parth";
        s3.rollno=96;
        s3.cgpa=8.99;

       // s1.print();
        s2.print();
       // s3.print();

    }
}
