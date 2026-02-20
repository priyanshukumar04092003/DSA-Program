package Arrays;

import java.util.Scanner;

public class ArraysArguments {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
          marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[]={99,100,101};
        update(marks);

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);



    }
}
