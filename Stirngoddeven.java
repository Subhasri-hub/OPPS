package java2;
import java.util.Scanner;
public class Stirngoddeven {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int b=a.length();
        if(b%2==0)
        {
            int c=b/2;
            for(int i=0;i<c;i++)
            {
                System.out.print(a.charAt(i));
            }
        }
        else
        {
            System.out.print("null");
        }
    }
}
