package OOPS;
class vehicle{
    int  wheels;
    int seat;
    int speed;
}
class MotorVehicle extends vehicle{
    int engine;
}
class  Aircraft extends MotorVehicle{
    int routers;
}

public class Inheritance2 {
    public static void main(String[] args) {
        Aircraft a = new Aircraft();
        a.wheels = 2;
        System.out.println(a.wheels);

    }
}
