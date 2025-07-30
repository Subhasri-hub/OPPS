package java2;
import java.awt.geom.Arc2D;
class Animal
{
    void eat()
    {
        int a=1;
        System.out.println(a);
        this.sleep();
    }
    void sleep()
    {
        int b=0;
        System.out.println(b);
    }
}
class Bird extends Animal{
    void eat()
    {
        int a=2;
        System.out.println(a);
        this.sleep();
        this.fly();
    }
    void sleep()
    {
        int b=3;
        System.out.println(b);
    }
    void fly()
    {
        System.out.print("bird can fly");
    }
}
public class Inheritanceanimal {
    public static void main(String[] args)
    {
    Animal a1=new Animal();
    a1.eat();
    Bird a2=new Bird();
    a2.eat();
}
}
