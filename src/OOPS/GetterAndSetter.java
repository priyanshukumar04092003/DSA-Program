package OOPS;

import java.util.Scanner;

class Students1{
    String name;
    private int roll ;
    double cgpa;
    public void  print(){
        System.out.println(name+" "+roll+" "+cgpa+" ");
    }
    // setter
    void setRoll(int x){
        roll=x;
    }

    // getter
    int getRoll(){
        return roll;
    }
}

public class GetterAndSetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students1 s = new Students1();
        s.name="priyanshu ";
        s.cgpa=8.26;
        s.setRoll(105);
        System.out.println(s.getRoll());


        // decalration of StringBuilder
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);

    }
}
