package OOPS;

public class ConstructorMarks {
    public static class StudentData{
        String name;
        int roll;
        int [] marks;

        StudentData(String n, int x, int s){
            name = n;
            roll = x;
            marks = new int [s];
        }

        void print(){
            System.out.println(name+" "+roll+" "+marks[0]+" "+marks[1]+" "+marks[2]+" "+marks[3]+" ");
        }

    }
    public static void main(String[] args) {
        StudentData s = new StudentData("priyanshu",105,4);
        s.marks[0]=77;
        s.marks[1]=76;
        s.marks[2]=78;
        s.marks[3]=79;

        s.print();



    }
}
