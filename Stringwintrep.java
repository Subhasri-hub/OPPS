package java2;
import java.util.Scanner;
public class Stringwintrep {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int a=s1.length();
        int b=sc.nextInt();
        String c=s1.substring(a-b,a);
        System.out.print(c.repeat(b));
    }
}
