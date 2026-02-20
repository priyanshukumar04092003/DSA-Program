package Arrays;

import java.util.Scanner;

public class StringSearch {
    public static int find(String menu[],String search){
        for(int i=0;i<menu.length;i++){
            if(search==menu[i]){
               return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu[] ={"chole bhature","Aloo paratha","Panner paratha"};
        String search= "chole bhature";

        int index= find(menu,search);

        if(index==-1){
            System.out.println("String is not found");
        }else{
            System.out.println("String is found at index"+" "+index);
        }
    }
}
