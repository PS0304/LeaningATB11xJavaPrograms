package ex_11_While_loop;

import java.util.Random;
import java.util.Scanner;

public class Lab_07_Guessing_game
{
    public static void main(String[] args)
    {
        //Guess a number between 1 to 10
        Random ran=new Random();
        int intrandom = ran.nextInt( 100)+1; // +1 including 10 also
        //System.out.println(intrandom); // to print the random number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you guess");

        int guess;
        int attempts=0;

        while (true)
        {
            guess=sc.nextInt();
            attempts++;
            if(guess<intrandom)
            {
                System.out.println("Too Low, Try again");
            } else if (guess>intrandom)
            {
                System.out.println("Too High, Try Again");
            }
            else
            {
                System.out.println("Correct !!! You guessed it in "+attempts+" attempts");
                break;
            }
        }
    }
}