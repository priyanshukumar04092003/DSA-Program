import java.util.Scanner;

public class pairs {
    public static void pair(int num[]){
        int tp=0;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j< num.length;j++){
                System.out.print("("+num[i]+","+num[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[]={10,20,30,40,50};
        pair(num);
    }
}
