package ex_10_For_Loop;

import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

public class Lab_05_for_loop_with_break
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the From number");
        int in= sc.nextInt();
        System.out.println("Enter the to number");
        int out=sc.nextInt();
        for (int i=in;i<=out;i++)
            if (i<=0)
            {
                System.out.println("Dont Enter Zero(0) and Negative value");
                break;
            }
        else
        {
            if (i%2==0)
            {
                System.out.println(i+" is Even number");
            }
            else
            {
                System.out.println(i+" is Odd number");
            }
        }

    }
}
