package OOPS;

public class Constructors {
    public static class Car{
        int seat;
        String name;
        double length;

//        Car(){ ye ek default constructor hai
//        Agar isko nhi bhi banaye toh constructor rahta hai
//        } bss hmlog ko dekhta nhi hai.


        Car(){

        }
        Car(String p,int a,double ln){
            name=p;
            seat=a;
            length=ln;
        }

        Car(String n){
            name=n;
        }

        // parameterized constructor.
      Car(int x,String s, double l){
          seat =x;
          name=s;
          length= l;
      }


        void print(){
            System.out.println(seat+" "+name+" "+length+" ");
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car(5 ,"creata",3.5);
        c1.print();

        Car c2 = new Car(4,"LORD Alto",2.75);
        c2.print();

        Car c3 = new Car();
        c3.name="MG Hector";
        System.out.println(c3.name);
        Car c4 = new Car("Mahindra");
        System.out.println(c4.name);

        Car c5 = new Car("alto",4,2.75);
        c5.print();



        //Note Agr tm object banaya hai usmein koi bhi parameter pass nhi kiya hai
        // lekin  phle se ek constructor hai jo value store kar raha hai kisis
        // object ka toh waha pe error de dega ,, iske liye ek default constructor banaya hoga
        // then wo error nhi dega

        //NOTE
        // agr tm  koi bhi object  banya hai phle bhi  usmein  parameter pss nhi kiya hai
        // tab  tmko default constructor banene ka jarurat nhi hai wo phle se hi bana raha rhta hai
        // yaad rakhna koi bhi constructor phle  se nhi bana hona chahiye.


    }
}
