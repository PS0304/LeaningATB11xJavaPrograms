package ex_02_JavaBasic_Part2;

public class Cli_max
{
    public static void main(String[] args)
    {
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        int max=(num1>num2)?num1:num2;
        System.out.println("Max number is "+max);

    }
}
