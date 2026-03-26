package String_Revision;

import java.util.Scanner;

public class CompareTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "priyanshu kumar";
        String str_1= "priya";
        System.out.println(str.compareTo(str_1));

        // Comapre To String Do String ko compare karta hai lexicography way mein
        // mtlb phele wale string ka charter ke asky value mein se durse wale string ke charter ka asky
        // value minus karta hai

    }
}
