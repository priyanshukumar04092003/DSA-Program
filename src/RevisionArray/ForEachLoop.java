package RevisionArray;

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {10,20,30,40,50};
        // for each loop syntax
        // kiska mtlb hota hai for int element in array ,, jo array hai uske element pe for loop lagana.
        // FoeEachLoop se hmlog element ko modify nhi kar sakte hai.
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
