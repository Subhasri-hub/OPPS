package java2;
class Author{
    private char a;
    private String b;
    private String c;
    Author(char a1,String b1,String c1)
    {
        a=a1;
        b=b1;
        c=c1;
        System.out.println(a+" "+b+" "+c);
    }
}
public class Parameterizedconstructor {
    public static void main(String[] args)
    {
        Author s1=new Author('F',"subha","subha@gmail.com");
    }
}
