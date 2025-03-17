package ex_02_JavaBasic_Part2;

import javax.swing.*;
import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 sides of Triangle");
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();
        if(side1==side2 && side2==side3)
        {
            System.out.println("Trinagle is Equilateral");
        }
        else if (side1==side2 || side1==side3 || side2==side3)
        {
            System.out.println("Trinagle is Isosceles");
        }
        else
        {
            System.out.println("Trinagle is Scalene");
        }
    }
}
