package OOPS;
class ArryList{
    int arr[];
    int size;
    int idx;

    ArryList(int capacity){
        arr = new int[capacity];
    }

    int capacity(){
        return arr.length;
    }

    void add(int ele){
        arr[idx++]=ele;
        size++;
    }

    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    int get(int index){
        return arr[index];
    }

    void set(int idx){
        arr[idx] = 36;
    }

    void remove(int idx){
        if(idx < 0 || idx >= size){
            System.out.println("Invalid index");
            return;
        }
        for(int i=idx;i<size;i++){
            arr[i]=arr[i+1];
        }
        size--;
    }

    void insert(int idx,int ele){
        for(int i=size;i>idx;i--){
            arr[i]=arr[i-1];
        }
        arr[idx]=ele;
        size++;
    }
}

public class ArrayList {
    public static void main(String[] args) {
        ArryList a = new ArryList(8);

       // System.out.println(a.capacity());
        a.add(20); a.add(30); a.add(40);
        a.add(50);a.add(60);a.add(70);
       // a.display();

       //System.out.println(a.size);
       // System.out.println(a.get(2));

       // a.set(2);
       // System.out.println(a.arr[2]);

       // a.remove(2);
       // a.display();
      //  System.out.println(a.size);

      // a.insert(1,7);
        a.display();

        a.remove(2);
        a.display();
    }
}

// example
//void  static inserts(){
//    for(int i =size;i>idx;i--){
//        arr[i]=arr[i-1];
//    }
//    arr[idx]=ele;
//    size++;
//    
//}
