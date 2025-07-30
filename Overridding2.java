package java2;
class Shape
{
    void draw()
    {
        System.out.print("drwaing shape");
    }
    void erase()
    {
        System.out.print("erasing shape");
    }
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("drawing circle");
        this.erase();
    }
    void erase()
    {
        System.out.println("erasing circle");
    }
}
class Triangle extends Shape
{
    void draw()
    {
        System.out.println("drawing triangle");
        this.erase();
    }
    void erase()
    {
        System.out.println("erasing triangle");
    }
}
class Square extends Shape
{
    void draw()
    {
        System.out.println("drawing square");
        this.erase();
    }
    void erase()
    {
        System.out.println("erasing square");
    }
}
public class Overridding2 {
    public static void main(String[] args) {
        Shape c=new Circle();
        c.draw(); 
        Shape t=new Triangle();
        t.draw(); 
        Shape s=new Square();
        s.draw();
    }
}
