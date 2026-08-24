package OOps;
import  java.util.*;
public class PassingClassesToMethods {
    public  static  class  car{
        int seats;
        String name;
        double length;
        String type;
        int torque;
        void print(){
            System.out.println(seats+" "+name+" "+length+" "+type+" "+torque+" ");
        }
    }

    static void main() {
        car c = new car();
        c.length = 3.99;
        c.name = "kia sonet";
        c.seats = 5;
        c.torque = 178;
        c.type = "SUV";

        change(c);

        System.out.println(c.seats);
        c.print();
    }
    private static void change(car c)
    {
        c.seats = 4;
     }

}
