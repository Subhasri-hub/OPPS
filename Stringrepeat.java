package java2;
import java.util.Scanner;
public class Stringrepeat {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int b=a.length();
        String c=a.substring(0,2);
        System.out.print(c.repeat(b));
    }
}
