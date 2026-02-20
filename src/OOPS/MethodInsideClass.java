package OOPS;

public class MethodInsideClass {
    public static class Car{
        String name;
        double length;
        int seat;
        int torque;
        String type;

        void print(){
            System.out.println(seat+" "+name+" "+length+" "+torque+" ");
        }
    }
    public static void main(String[] args) {
    Car c = new Car();
    c.seat=5;
    c.torque=170;
    c.name="creta";
    c.length=3.75;
    c.print();
    }
}
