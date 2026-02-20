package OOPS;

 class Students{
    String name;
    private int roll =105;
    double cgpa;
    void print(){
        System.out.println(name+" "+cgpa+" "+roll+" ");
    }
    public void p(){
        print();
    }
}
public class PrivateKeyWord {
    public static void main(String[] args) {
        Students s = new Students();
        s.name = "Priyanshu";
        s.cgpa = 8.26;
        s.p();

        Students s1 = new Students();
        s1.p();


    }
}



