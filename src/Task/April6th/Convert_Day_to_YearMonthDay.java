package Task.April6th;

import java.util.Scanner;

public class Convert_Day_to_YearMonthDay
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Enter the Number");
        int year=num/365;
        int extraday=num%365;

        int month=extraday/30;
        int day=extraday%30;

        System.out.println("Years: "+year+", Months: "+month+", Days: "+day);
    }
}
