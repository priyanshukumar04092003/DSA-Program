package OOPS;

//class Cricketer{
//    //    Final Keyword
//    final String country = "INDIA";
//    int runs;
//    String name;
//    double avg ;
//}
//
//public class FinalAndStaticKeyWord {
//    public static void main(String[] args) {
//        Cricketer c = new Cricketer();
//        System.out.println(c.country);
//        //c.country="PAKISTAN"; Error dega kyu ki agr  final keyword aayega  toh  variable change nhi hoga.
//        Cricketer c2 = new Cricketer();
//        System.out.println(c2.country);
//    }
//}


// NOTE
// Agr koi bhi variable ke aage final laga h uska mtlb wo fix ho gya hai usko hmlog
// change nhi kar sakte hai.





//                    Static KeyWord
// agr kisi bhi variable ke aage staic keyword laga h toh wo ek alag variable banta h isko sab object use kar sakta hai
//mtlb sare object ke liye common variable ho jayega sab use kar sakte hai


class Cricketer{
     final static String country = "nz";
    String name;
    int runs;
    double avg;

    void  print(){
        System.out.println(name+" "+runs+" "+avg+" ");
    }

    static void get(){
        System.out.println("I LOVE INDIA");
    }
}

public class FinalAndStaticKeyWord {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
       // c1.country="INDIA";

        Cricketer c2 = new Cricketer();
        System.out.println(c2.country);
        print();

        c2.get();

    }
    // hmlog function  ke aage static isliye lagate hai  taki wo function sab class mein access ho sake.

        public static void print(){
        System.out.println("Priyanshu kumar");
    }
}





// note
// static element  ko hmlog print bhi kar sakte hai bina object create kiye .
// example

//
//static void get(){
  //  System.out.println("I LOVE INDIA");
// }

// isko hmlog bss class name . funticon se bhi run kar sakte hai
// Crickter.get()
// se bhi print kar sakte hai













