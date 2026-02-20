package Arrays;
import java.util.*;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
        marks[0]=sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);

        }
        marks[2]=30;
        System.out.println(marks[2]);
        System.out.println(marks.length);
    }
}
