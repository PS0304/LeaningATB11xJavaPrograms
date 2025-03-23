package Task;

import java.util.Scanner;

public class Fibonacci_for_loop
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:\n");
        int num=sc.nextInt();

        int first=0;
        int second=1;
        int i=0;
        while (i<=num)
        {
            int sum=first+second;
            System.out.println(sum);
            first=second;
            second=sum;
            i++;
        }
        sc.close();
    }
}
