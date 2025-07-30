package java2;
import java.util.Scanner;
public class Stringxcharremoval {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int a=s1.length();
        if(s1.charAt(0)=='x' && s1.charAt(a-1)=='x')
        {
            System.out.print(s1.substring(1,a-1));
        }
        else if(s1.charAt(0)=='x' || s1.charAt(a-1)=='x')
        {
            System.out.print(s1.replace("x",""));
        }
        else{
            System.out.print(s1);
        }
    }
}
