package java2;
import java.util.Scanner;
class Box
{
    int height,width,depth;
    Box(int a,int b,int c)
    {
        height=a;
        width=b;
        depth=c;
    }
    void volume()
    {
        int d=height*width*depth;
        System.out.print(d);
    }
}
public class Boxvolclass {
    public static void main(String[] args) {
        Box a1=new Box(4,5,2);
        a1.volume();
    }
}
