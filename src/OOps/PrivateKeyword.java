package OOps;
import  java.util.*;
    class Students
    {
        String name;    // nulll
       private  int rno; //0
        double cgpa;   // 0.0
        private void print() {
            System.out.println(name+" "+cgpa+" "+rno);
        }
        public  void p(){
            print();
        }
        int getRno(){
            return  rno;
    }
    void setRno(int x){
            rno = x;
    }

    }
public class PrivateKeyword {
    static void main() {
        Students s1 = new Students();
        System.out.println((s1.cgpa));
      //  System.out.println(s1.rno);
        s1.cgpa = 6.9;
        s1.name = "nidsss";
        //s1.rno = 23
        Students s2  =  new Students();
      s2.p();
      s1.p();
        System.out.println(s1.getRno());

    }
}
