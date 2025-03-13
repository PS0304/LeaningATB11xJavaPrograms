package ex_02_JavaBasic_Part2;

import java.util.Scanner;

public class March13_2025_Task_Grade
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you score");
        int score=sc.nextInt();

        String grade= (score<=0) ? "Score can't be in Negative or zero, Please Enter correct Score"
                :(score<=59) ? "Your Grade is F"
                :(score<=69) ? "Your Grade is D"
                :(score<=79) ? "Your Grade is C"
                :(score<=89) ? "Your Grade is B"
                :(score<=100)? "Your Grade is A"
                :"Score can't be more than 100, Please Enter correct score";
        System.out.println(grade);
    }
}
