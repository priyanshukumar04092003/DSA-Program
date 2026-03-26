package String_Revision;

import java.util.Scanner;

public class StringToCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char [] ch = name.toCharArray();

        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }

        //    camel and pascel written line examples

        // is Tareeke Se Likha Hoga Toh Wo Camel Case bolte hai
        // Is Way Ko Pascal case Bolte Hai

    }
}
