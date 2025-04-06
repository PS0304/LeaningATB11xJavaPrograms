package Task.April6th;

import java.util.Scanner;

public class Determine_domain
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Website Address");
        String web=sc.next();
        if (web.contains(".com"))
        {
            System.out.println("Commercial website");
        }
        else if (web.contains(".org"))
        {
            System.out.println("Non-profit organization");
        }
        else if (web.contains(".edu"))
        {
            System.out.println("The website type is: Educational institution");
        }
        else if (web.contains(".gov"))
        {
            System.out.println("The website type is: Government website");
        }
        else if (web.contains(".net"))
        {
            System.out.println("The website type is: Network-related website");
        }
        else if (web.contains(".info"))
        {
            System.out.println("The website type is: Informational website");
        }
        else
        {
            System.out.println("The website type is: Unknown or other types of websites");
        }
    }
}
