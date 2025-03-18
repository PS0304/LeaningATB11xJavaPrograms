package ex_02_JavaBasic_Part2;

public class cli_user_input {
    public static void main(String[] args)
    {
        // Age-24, Name-Prabhat , Salary - 240000
        String age_string =args[0];
        String name_string=args[1];
        String salary_string=args[2];
        int age=Integer.parseInt(age_string);
        int salary=Integer.parseInt(salary_string);
        System.out.println(age);
        System.out.println(name_string);
        System.out.println(salary);
    }
}
