package java2;
import java.util.Scanner;
public class Stringcharconcate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(s1.length()==s2.length())
        {
        for(int i=0;i<s1.length();i++)
        {
            System.out.print(s1.substring(i,i+1));
            for(int j=i;j<=i;j++)
            {
                System.out.print(s2.substring(j,j+1));
            }
        }
    }
    else {
            int minLength = Math.min(s1.length(), s2.length());
            for (int i = 0; i < minLength; i++) {
                System.out.print(s1.substring(i, i + 1));
                System.out.print(s2.substring(i, i + 1));
            }
            if (s1.length() > s2.length()) {
                System.out.print(s1.substring(minLength));
            } else {
                System.out.print(s2.substring(minLength));
            }
        }
}
}
