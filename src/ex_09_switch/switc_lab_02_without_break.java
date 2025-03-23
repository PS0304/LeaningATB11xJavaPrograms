package ex_09_switch;

import java.util.Scanner;

public class switc_lab_02_without_break
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day(1 to 7)");
        int day=sc.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thu");
            case 5:
                System.out.println("Fri");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
            default:
                System.out.println("Invalid Input");
        }

    }
}
