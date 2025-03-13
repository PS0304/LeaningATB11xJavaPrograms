public class ex_06_Ternary_Operator
{
    public static void main(String[] args)
    {
        int Age=15;
        String AgeGroup = (Age>18)?(Age>60?"Senior":"Adult"):"Kid";
        System.out.println(AgeGroup);
    }
}
