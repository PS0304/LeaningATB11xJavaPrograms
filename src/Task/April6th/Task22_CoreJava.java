package Task.April6th;

import java.util.Scanner;

public class Task22_CoreJava
{
    public static void main(String[] args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        num=sc.nextInt();
        if(num%5==0 && num%11==0)
        {
            System.out.println(num+" is Divisible by 5 and 11");
        }
        else if(num%5==0)
        {
            System.out.println(num+" is only Divisible by 5");
        } else if (num%11==0)
        {
            System.out.println(num+" is only Divisible by 11");
        }
    }
}
