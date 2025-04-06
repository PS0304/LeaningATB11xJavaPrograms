package Task.April6th;

import java.util.Scanner;

public class Person_Age_Category
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age");
        int age=sc.nextInt();

        if (age<0)
        {
            System.out.println("Invalid Age you have Entered");
        } else if (age>=0 && age<=12)
        {
            System.out.println("Your are Child");
        } else if (age>=13 && age<=19)
        {
            System.out.println("Your are Teenager");
        } else if (age>=20 && age<=64)
        {
            System.out.println("Your are Adult");
        }
        else
        {
            System.out.println("You are Senior Citizen");
        }
    }
}
