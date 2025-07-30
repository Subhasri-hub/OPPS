package java2;
import java.util.Scanner;
public class Stringconcatenate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int a=s1.length();
        int b=s2.length();
        if(a!=b){
        if(a>b)
        {
            System.out.print(s2+s1+s2);
        }
        else{
            System.out.print(s1+s2+s1);
        }
    }
    }
}
