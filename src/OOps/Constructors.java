package OOps;

class car{
    int seats;
    String name ;
    double length;

    car(){//default constructo
 }

    car(int x,String s , double d){
        seats = x;
        name = s;
        length = d;
    }

    void print(){
        System.out.println(seats +" "+name+" "+length);
    }

}



public class Constructors {
    static void main() {
        car c1 = new car(5, "nidsss",3.99);
        c1.print();
        car c2 = new car(4,"load alto",3.75);
        c2.print();
        car c3 = new car();
        c3.name = "honda Amaze ";

    }
}
