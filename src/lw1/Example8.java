package lw1;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the name of the day of the week: ");
        String dayOfWeak = in.nextLine();

        System.out.println("Enter the name of the month: ");
        String month = in.nextLine();

        System.out.println("Enter the day number in the month (number): ");
        int dayNumber = in.nextInt();

        System.out.println("Today: " + dayOfWeak + ", " + dayNumber + ", " + month + " ");

        in.close();

    }

}
