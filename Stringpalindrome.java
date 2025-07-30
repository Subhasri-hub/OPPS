package java2;
import java.util.Scanner;
public class Stringpalindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b="";
        int c=a.length();
        for(int i=c-1;i>=0;i--)
        {
            b=b+a.charAt(i);
        }
        if(a.equals(b))
        {
            System.out.print("palindrome");
        }
        else
        {
            System.out.print("not a palindrome");
        }
    }
}
