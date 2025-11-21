package lw3;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the name of the day of the week: ");
        String day = in.nextLine().toLowerCase();

        switch (day) {
            case "monday" -> System.out.println("1");
            case "tuesday"     -> System.out.println("2");
            case "wednesday"      -> System.out.println("3");
            case "thursday"     -> System.out.println("4");
            case "friday"    -> System.out.println("5");
            case "saturday"    -> System.out.println("6");
            case "sunday" -> System.out.println("7");
            default -> System.out.println("Такого дня недели нет.");
        }

        in.close();
    }
}
