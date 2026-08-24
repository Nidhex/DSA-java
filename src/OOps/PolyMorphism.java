/// ek naam multiple  kaam
/// many form
package OOps;

public class PolyMorphism {
    public static  class Dog{
        void speak(){
            System.out.println(" bhow bhow");
        }
    }
    public  static class   Cat{
        void speak(){
            System.out.println(" meow meow");
        }

    }
    public  static  class  lion{
        void speak(){
            System.out.println("grrrrrrr");
        }
    }
    public  static  class human{
        void speak(){
            System.out.println("hello...");
        }
    }
    public  static  class pikachu{
        void speak(){
            System.out.println("pika pika");
        }
    }

    static void main() {
        Dog d = new Dog();
        Cat c = new  Cat();
        human h = new human();
        pikachu p = new pikachu();

        d.speak();
        c.speak();
        h.speak();
        p.speak();

    }
}
