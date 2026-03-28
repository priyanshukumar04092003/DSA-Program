package String_Revision;

import java.util.Scanner;

public class String_Builders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("priyanshu");
        sb.append("kumar");
        System.out.println(sb);
        System.out.println(sb.length()+" "+sb.capacity());

       // Set Charcter At Given Index.
        sb.setCharAt(2,'p');
        System.out.println(sb);

        sb.delete(2,6);
        System.out.println(sb);

        // Convert the StringBuilder to String
        String t = sb.toString();
        System.out.println(t);
    }
}
