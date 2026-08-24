package OOps;
import java.util.*;



public class UserDefindDataType {
    public  static  class Student{  // kudh ka datatype bana liya hai
        String name;
        int rno;
        double cgpa;
        void print(){
            System.out.println(name+" "+rno+" "+cgpa);
        }

    }
    static void main() {
       Student s1 =  new Student();
       s1.name  = "niddss";
       s1.rno = 23;
       s1.cgpa = 8.95;

       Student s2 =  new Student();
       s2.name  = "cnadyyy";
       s2.rno = 13;
       s2.cgpa = 9.33;


       Student s3 =  new Student();
       s3.name  = "rockyyy";
       s3.rno = 20;
       s3.cgpa = 6.33;


    //    System.out.println(s1.name+ " "+s1.cgpa+" "+s1.rno);
        s2.cgpa = 9.8;

        s1.print();
        s2.print();
        s3.print();





    }
}
