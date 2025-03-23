package ex_10_For_Loop;

public class Lab_06_for_loop_with_continue
{
    public static void main(String[] args)
    {
        // use of continue to find even number
        for (int i=1;i<=50;i++)
        {
            if (i%2==0)
            {
                System.out.println(i+" is Even Number");
                continue;//skip and move to top i.e. to for loop
            }
            System.out.println(i+" is Odd Number");
        }
    }
}