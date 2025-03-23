package ex_09_switch;

import java.util.Scanner;

public class switch_lab_03_without_default {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day(1 to 7)");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
        }
    }
}
