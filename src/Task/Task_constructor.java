package Task;

public class Task_constructor
{
    public static void main(String[] args)
    {
        Person1 p1=new Person1();
        p1.printDetails();

        Person1 p2=new Person1("Prabhat",25,"Bilaspur",98855886,true );
        p2.eat();
        p2.sleep();
        p2.printDetails();

        Person1 p3=new Person1("Sonu",45,98876444);
        p3.doHomework();
        p3.eat();
        p3.walk();
        p3.printDetails();
    }
}
class Person1 {
    // Attributes| Instance Variables| Member Variables | data members
    String name;
    int age;
    String address;
    long phone;
    boolean isMale;

    //1. Default Constructor
    Person1()
    {
        name = "Default Name - Prabhat Sao";
        age=20;
        address="New Delhi";
        phone=909090090;
        isMale=true;
    }
    Person1(String name, int age,String address,long phone,boolean isMale)
    {
        this.name=name;
        this.age=age;
        this.address=address;
        this.phone=phone;
        this.isMale=isMale;
    }
    Person1(String name,int age, long phone)
    {
        this.name=name;
        this.age=age;
        this.phone=phone;
    }

    //Methods
    void eat()
    {
        System.out.println(this.name+" is eating");
    }
    void sleep()
    {
        System.out.println(this.name+" is sleeping");
    }
    void walk()
    {
        System.out.println(this.name+" is walking");
    }
    void doHomework()
    {
        System.out.println(this.name+" is doing homework");
    }
    void printDetails()
    {
        System.out.println("Name - "+name);
        System.out.println("Age - "+age);
        System.out.println("Address - "+address);
        System.out.println("Phone - "+phone);
        System.out.println("Is Male - "+isMale);
        System.out.println("-----------------------------------------------------------");
    }
}


