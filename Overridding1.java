package java2;
class Fruit
{
    String size;
    String name;
    String taste;
    void eat()
    {
        System.out.print(size+" "+name+" "+taste);
    }
}
class Apple extends Fruit{
     void eat()
    {
        size="small";
        name="apple";
        taste="ok";
        System.out.print(size+" "+name+" "+taste);
    }
}
class Orange extends Fruit{
     void eat()
    {
        size="large";
        name="orange";
        taste="yummy!";
        System.out.print(size+" "+name+" "+taste);
    }
}
public class Overridding1 {
    public static void main(String[] args)
    {
        Orange a1=new Orange();
        a1.eat(); 
    }
}
