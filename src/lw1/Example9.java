package lw1;

import java.util.Scanner;

public class Example9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the name of the month: ");
        String month = in.nextLine();

        System.out.println("Enter the number of days in the month: ");
        int days = in.nextInt();

        System.out.println("Month " + month + " contains " + days + " days");

        in.close();

    }

}
