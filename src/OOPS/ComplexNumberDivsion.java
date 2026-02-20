package OOPS;

public class ComplexNumberDivsion {
    public static class ComplexNoDiv{
        double x;
        double y;

        ComplexNoDiv(double x , double y){
            this.x = x;
            this.y = y;
        }
        void print(){
            if(y>0){
                System.out.println(x+" + "+y+"i");
            }else{
                System.out.println(x+" - "+(-y)+"i");
            }
        }
        void Divide(ComplexNoDiv c1){
            this.x= (x*c1.x + y*c1.y)/(c1.x*c1.x + c1.y*c1.y);
            this.y= (y*c1.x - x*c1.y)/(c1.x*c1.x + c1.y*c1.y);
        }
    }
    public static void main(String[] args) {
        ComplexNoDiv c = new ComplexNoDiv(5,3);
        ComplexNoDiv c1 = new ComplexNoDiv(3,2);
        c.print();
        c1.print();
        c.Divide(c1);
        c.print();
    }
}

// Note agr  do Complex Number ko Divide karne (a+ib) and (c+id) ko dive karne ka formula hai
//     (ac+bd)/(c^2+d^2)  real part ka
//     (bc-ad)/(c^2+d^2)
