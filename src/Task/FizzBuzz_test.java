package Task;

import java.util.Scanner;

public class FizzBuzz_test
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number\n");
        int num=sc.nextInt();
        for (int i=1;i<=num;i++)
        {
            if (i%3==0 && i%5==0)
            {
                System.out.println(i+" is FizzBuzz");
            } else if (i%3==0)
            {
                System.out.println(i+" is Fizz");
            } else if (i%5==0)
            {
                System.out.println(i+" is Buzz");
            }
            else
            {
                System.out.println(i+" Normal number");
            }
        }
    }
}
