package OOPS;

public class PassingClassesToMethod {
    public static  class Car{
        String name;
        double length;
        int seat;
        int torque;
        String type;
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.name="HUNDAI";
        c.length=375;
        c.seat=5;
        c.torque=178;
        c.type="SUV";

        change(c);
        System.out.println(c.seat);

        Car c1 = new Car();
        c1.name="HONDA";

         changes(c1);
        System.out.println(c1.name);



    }
    // yaha pe x bhi addess ko define kar raha hai car object ka ,, agar tm c likho
    // yaa fir x likho dono ek hi address ko pakad ke rakah hai.


    public static void change(Car x){
        x.seat=4;

    }

    //same chizz yaha pe bhi huya hai  agr tm c1 likhe tab yaa y likho
    //tab dono ek hi address pe point kar raha hai.

    public static void changes(Car y){
        y.name="ALTO";
    }
}




