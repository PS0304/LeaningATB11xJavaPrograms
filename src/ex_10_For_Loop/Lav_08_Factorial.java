package ex_10_For_Loop;

import java.util.Scanner;

public class Lav_08_Factorial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();

        int fact=1;
        if (num<=0)
        {
            System.out.println(fact);
        }
        else
        {
            for (int i=1;i<=num;i++)
            {
                fact=fact*i;
            }
            System.out.println("Factorial is -> "+fact);
        }
    }
}
