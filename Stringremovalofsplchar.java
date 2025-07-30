package java2;
import java.util.Scanner;
public class Stringremovalofsplchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int a=s1.length();
        int b=s1.indexOf("*");
        if(b>0 && b<a-1)
        {
            System.out.print(s1.substring(0,b-1)+s1.substring(b+2));
        }
    }
}
