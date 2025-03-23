package ex_10_For_Loop;

import java.util.Scanner;

public class Lab_04_for_loop
{
    public static void main(String[] args)
    {

        // print even and odd number from 1 to 50
        for(int i=1;i<=50;i++)
        {
            if (i%2==0)
            {
                System.out.println(i+" is Even no");
            }
            else
            {
                System.out.println(i+" is Odd no");
            }
        }
    }
}
