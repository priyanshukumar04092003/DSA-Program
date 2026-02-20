package OOPS;

public class ThisKeyWord {
    public static class Car{
        String name;
        int price;

        Car(String name,int price){
            this.name=name;
            this.price=price;
        }
        void print(){
            int price =12;
            System.out.println(this.price+" "+" "+name);
        }
    }
    public static void main(String[] args) {
        Car c = new Car("kia Sonet",120000);
        c.print();
    }
}

// NOTE
// this key word ka hmlog isliye use karte hai ,, agr maanlo constructor ke under jo value pass huya hai  or class mein valiable hai dono same hai
//agr hmko value dena  toh dono same name rahega toh samhj mein nhi aayega kiska baat hos raha hai ,, constructor wala ka yaa calss wale variable
// isliye this key word ka use karte hai .
