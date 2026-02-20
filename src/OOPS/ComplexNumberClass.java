package OOPS;

class ComplexNumber{
    double x;
    double y;

    ComplexNumber(int x, int y){
        this.x=x;
        this.y=y;
    }
    void print(){
        if(y>=0) {
            System.out.println(x+" + "+y+"i");
        }else{
            System.out.println(x+" - "+(-y)+"i");
        }
    }
// add two ComplexNumber.
    public void add(ComplexNumber c2) {
        this.x += c2.x;
        this.y += c2.y;
    }

    public void multiply(ComplexNumber c2) {
        this.x =(this.x*c2.x - this.y*c2.y);// formula laga hai  (a+ib)(c+id) product of two complex number
        this.y= (this.x*c2.y + this.y*c2.x);//      (ac−bd)+i(ad+bc).
    }
}
public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(5,-1);
        ComplexNumber c2 = new ComplexNumber(3,4);
        c1.print();
        c2.print();

        c1.add(c2);
        c1.print();

        c1.multiply(c2);
        c1.print();



    }
}
