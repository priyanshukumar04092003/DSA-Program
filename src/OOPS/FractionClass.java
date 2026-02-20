package OOPS;
class Fraction{
    int num;
    int dem;

    Fraction(int num, int dem){
        this.num=num;
        this.dem=dem;
        simplify();
    }
    void print(){
        System.out.println(num+"/"+dem);
    }
    void add(Fraction f1){
        num=(num*f1.dem + f1.num*dem);
        dem=(dem*f1.dem);
    }
    void multiply(Fraction f1){
        num=num*f1.num;
        dem=dem* f1.dem;
        simplify();
    }
    void divide(Fraction f1){
        num=num*f1.dem;
        dem=dem*f1.num;
        simplify();
    }
    int HCF(int x,int y){
        int temp;
        while(y!=0){
            temp=y;
            y=x%y;
            x=temp;
        }
        return x;
    }
    void simplify(){
        boolean isNegative = (num*dem < 0)? true : false;

        // num or dem ko positive karne ke liye likhe hai .
        num=Math.abs(num);
        dem=Math.abs(dem);
        int gcd = HCF(num,dem);
        num=num/gcd;
        dem=dem/gcd;

        if(isNegative== true){
            num=-num;
        }
    }

}

public class FractionClass {
    public static void main(String[] args) {

        Fraction f = new Fraction(3,5);
        Fraction f1 = new Fraction(3,5);
        f.print();
        f1.print();

//        f.add(f1);
//        f.print();
//        f.multiply(f1);
//        f.print();

        f.divide(f1);
        f.print();


    }
}
