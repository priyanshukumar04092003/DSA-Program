package Strings;

import java.util.Scanner;

public class ShortestPath {
    public static void shortest_path(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dis=path.charAt(i);
            //west
            if(dis=='W'){
                x--;
            }
            //east
            else if(dis=='E'){
                x++;
            }
            //south
            else if(dis=='S'){
                y--;
            }
            //north
            else{
                y++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        int sqt=(int)Math.sqrt(x2+y2);
        System.out.println("The sortest path is:"+sqt);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path="WNEENESENNN";
        shortest_path(path);
    }
}
