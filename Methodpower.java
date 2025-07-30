package java2;
import java.util.Scanner;
import java.util.*;
class Power{
    int num1,num2;
    double num;
void powerInt(int a,int b)
{
    num1=a;
    num2=b;
    double c=Math.pow(num2,num1);
    System.out.println(c);
}
void powerDouble(double a,int b)
{
    num=a;
    num2=b;
    double c=Math.pow(num2,num);
    System.out.println(c);
}
}
public class Methodpower {
    public static void main(String[] args) {
        Power a1=new Power();
        a1.powerInt(2,3);
        a1.powerDouble(3,4);
    }
}
