import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
            case 1:System.out.println("samosa");
                  break;
            case 2:System.out.println("Iddly");
                 break;
            case 3:System.out.println("doas");
            break;
            default:System.out.println("Thala");
        }
    }
}
