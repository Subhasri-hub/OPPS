package java2;
class Book
{
    private int a;
    private String author;
    private String authorOfBook;
    private double price;
    Book(int a,String author,String authorOfBook,double price)
    {
        this.a=a;
        this.author=author;
        this.authorOfBook=authorOfBook;
        this.price=price;
        System.out.printf(a+" "+author+" "+authorOfBook+" "+price);
    }
}
public class Encapsulationtask {
    public static void main(String[] args) {
        Book a1=new Book(50,"subha","shakesphere",200);
    }
}
