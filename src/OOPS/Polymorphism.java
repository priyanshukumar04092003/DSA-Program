package OOPS;

public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhouu"+" "+"Bhouu");
        }
    }
    public static class Cat {
        void speak() {
            System.out.println("Meow" + " " + "Meow");
        }
    }

    public static class Lion {
        void speak() {
            System.out.println("GRRRRRR"+" ");
        }
    }

    public static class pikachu {
        void speak(){
            System.out.println("pika"+" "+"pika");
        }
    }


    public static class Human {
        void speak() {
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {

        Dog d = new Dog();
        d.speak();

        Cat c = new Cat();
        c.speak();

        Lion l = new Lion();
        l.speak();

        pikachu p = new pikachu();
        p.speak();


        Human h = new Human();
        h.speak();


    }
}
