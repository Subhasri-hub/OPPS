package java2;
import java.util.Scanner;
public class Stringlowercase {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        //String s3=s1+s2;
        System.out.print((s1+s2).toLowerCase());
    }
}
