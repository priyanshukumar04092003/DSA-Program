package Functions;

import java.util.Scanner;

public class factorial {
    public static void fact(int num) {
        int Fact = 1;
        for (int i =1; i<=num; i++) {
            Fact = Fact * i;
        }
        System.out.println(Fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
    }
}
