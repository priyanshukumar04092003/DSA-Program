package OOPS;
// parent class yaa super calss
class Pokemon{
    private int power;
    String type;

    Pokemon(String type, int power){
        this.power = power;
        this.type = type;
    }

    Pokemon(){
    }

     void print(){
         System.out.println(this.power+" "+this.type);
     }
}

// suclass or child class
 class LegenaryPokemon extends Pokemon{
     String ablitity;


 }

public class Inheritance {
    public static void main(String[] args) {
        LegenaryPokemon l = new LegenaryPokemon();
        l.type = "Good";
        System.out.println(l.type);
        l.ablitity = "osam";

        Pokemon  p= new Pokemon();
        p.print();

    }
}
