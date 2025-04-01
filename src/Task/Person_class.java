package Task;

import ex_02_JavaBasic_Part2.TriangleClassifier;

public class Person_class
{
    public static void main(String[] args)
    {
        Person p1=new Person();
        p1.getName(); // Without Parameters and Without Return Type
        System.out.println(p1.getAddress()); //Without Parameters but With Return Type
        p1.get_mobile(909090); //With Parameters and Without Return Type
        p1.get_Full_Details("Prabhat", "prabhat.sao@gmail.com", 986293565); //With Parameters and With Return Type
    }
}
class Person
{
    String name;
    byte age;
    boolean ismale;
    boolean ismarried;
    double salary;
    String Address;
    float height;
    double mobile;
    String email;

    void getName()
    {
        System.out.println("Your name is Prabhat Sao");
    }
    String getAddress()
    {
        return "Bilaspur";
    }
    void get_mobile(double mobile)
    {
        System.out.println("Your mobile number is"+mobile);
    }
    String get_Full_Details(String name, String email, double mobile)
    {
        System.out.println("Your name is "+name+" ,Email Address is "+email+"Mobile number"+mobile);
        return("name"+name+"email"+email+"mobile number"+mobile);
    }

}
