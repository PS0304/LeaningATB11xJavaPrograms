package ex_02_JavaBasic_Part2;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        if (num%2 ==0)
        {
            System.out.println("Entered number is Even");
        }
        else
            System.out.println("Entered number is Odd");
    }
}
