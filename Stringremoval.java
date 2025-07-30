package java2;
import java.util.Scanner;
public class Stringremoval {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int b=a.length();
        if(b<=1)
        {
            //String s1=a.substring(0,b-1);
            System.out.print("s1");
        }
        else{
            String s1=a.substring(1,b-1);
            System.out.print(s1);
        }
    }
}
