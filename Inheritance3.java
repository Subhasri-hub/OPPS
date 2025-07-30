package java2;
class Person
{
    void name()
    {
        String name="subha";
        String dob="23/11/2004";
        System.out.println(name+" "+dob);
    }
}
class Teacher extends Person{
    void display()
    {
    double salary=25000;
    String subject="english";
    System.out.println(salary+" "+subject);
    }
}
class Student extends Person{
    void dis()
    {
    double studid=12345;
    System.out.println(studid);
    }
}
class Collegestudent extends Student{
    void show()
    {
        String clgname="kncet";
        int year=4;
        System.out.println(clgname+" "+year);
    }
}
public class Inheritance3 {
    public static void main(String[] args) {
        Person a1=new Person();
        a1.name();
        Teacher a2=new Teacher();
        a2.display();
        Student a3=new Student();
        a3.dis();
        Collegestudent a4=new Collegestudent();
        a4.show();
    }
}
